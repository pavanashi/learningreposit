package testcaseUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Relativelocatest {

	public static WebDriver driver;
	public static String browser;
		public static void main(String[] args) {
			
			browser = "chrome";
			if(browser.equals("chrome")) {
				driver = new ChromeDriver();
			}
			else if (browser.equals("edge")) {
				driver = new EdgeDriver();	
			}
			else if (browser.equals("ie")) {
				driver = new InternetExplorerDriver();
			}
			
			driver.get("http://www.google.com");
			driver.findElement(By.cssSelector("#SIvCob > a:nth-child(2)")).click();
			//driver.findElement(By.id("APjFqb")).sendKeys("facebook");
			By gmaillocator = RelativeLocator.with(By.linkText("Gmail")).toLeftOf(By.cssSelector("#gb > div > div:nth-child(1) > div > div:nth-child(2) > a"));
			driver.findElement(gmaillocator).click();
			
			// like this you can use relative locators if you are unable to find elements using locators.
			

	}

}
