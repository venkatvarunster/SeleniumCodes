import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.getProperty("webdriver.chrome.driver", "/Selenium Pactice/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//driver.manage().window().maximize();
		Actions a= new Actions(driver);
		
		//a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']")));
		
		//a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("pixel 2 xl").build().perform();
		//a.moveToElement(move).build().perform();
		
		//a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).contextClick().build().perform();
		
		
		
		
		

	}

}
