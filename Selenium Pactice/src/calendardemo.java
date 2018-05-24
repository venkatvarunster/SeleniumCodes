import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendardemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.getProperty("webdriver.chrome.driver", "/Selenium Pactice/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("");
		driver.findElement(By.xpath(".//*[@id='travel_date:']")).click();
		
		while(!driver.findElement(By.cssSelector("[class=''][class='']")).getText().contains("April"))
		{
			driver.findElement(By.cssSelector("[class='']")).click();			
		}
		
		
		List<WebElement> dates= driver.findElements(By.className("day"));
		
		int count = driver.findElements(By.className("day")).size();
		
		for(int i=0;i<count;i++)
		{
			String text=driver.findElements(By.className("day")).get(i).getText();
			if(text.equalsIgnoreCase("23"))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
				
			}
		}
		
		

	}

}
