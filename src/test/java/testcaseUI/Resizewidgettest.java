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

public class Resizewidgettest {
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
		
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		WebElement fm = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(fm);
		WebElement spot = driver.findElement(By.xpath("//div[contains(@class,'diagonal-se')]"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(spot, 45, 63).perform();
	  
	
		

	}

}
