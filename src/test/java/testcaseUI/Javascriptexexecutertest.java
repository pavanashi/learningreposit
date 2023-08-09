package testcaseUI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Javascriptexexecutertest {
	public static WebDriver driver;
	public static String browser;
	public static void main(String[] args) throws InterruptedException {
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
		
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("div#gh-ac-box2>input[id='gh-ac']")).sendKeys("tee shirt");
		WebElement scrollpoint = driver.findElement(By.cssSelector("h2.hl-card-header__headline>a"));
		JavascriptExecutor jse =  (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView();", scrollpoint);
		
	
		

	}

}
