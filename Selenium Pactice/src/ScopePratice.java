import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ScopePratice {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.getProperty("webdriver.chrome.driver", "/Selenium Pactice/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		 
		driver.get("");
		
		WebElement footerdriver = driver.findElement(By.xpath(""));
		
		int count = footerdriver.findElements(By.tagName("a")).size();
		
		for(int i=0;i<count;i++) {
			
			String clickonlinktab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			footerdriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
			Thread.sleep(5000L);
			
			Set<String> abc=driver.getWindowHandles();
			Iterator<String> it=abc.iterator();
			
			while(it.hasNext()){
				
				driver.switchTo().window(it.next());
			}
		}
		
}
}