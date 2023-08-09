package testcaseUI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Autosuggestdropdowntest {
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
		
		driver.get("https://www.emirates.com/ae/english/");
		driver.manage().window().maximize();
	    //driver.findElement(By.xpath("//button[text()='Accept']")).click();
		
		/*Thread.sleep(2000);
		WebElement we = driver.findElement(By.xpath("//input[@id='Departure airport-4b3a7edf-d1c5-445b-b36a-a3e6d77c9d44']"));
		
		we.clear();
		we.sendKeys("Mumbai");
		we.sendKeys(Keys.ARROW_DOWN);
		we.sendKeys(Keys.ENTER);
	*/
		

	}

}
