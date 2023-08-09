package cssselecttest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Csstest5 {

	public static WebDriver driver;
	public static String browser;
	public static void main(String[] args) {
		
		browser = "chrome";
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		 else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		} else if (browser.equals("ie")) {
			driver = new InternetExplorerDriver();
		}

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		//methods to find dynamic webelements using pseudo classes
		driver.findElement(By.cssSelector("div.form_group>:first-child")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("form>:nth-child(2) input")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("form>:nth-last-child(1)")).click();



		
	}

}
