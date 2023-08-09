package cssselecttest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Csstest3 {

	public static WebDriver driver;
	public static String browser;
	public static void main(String[] args) throws InterruptedException {
		
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
		//methods to find dynamic webelements using child combinator,child and subchild types
		driver.findElement(By.cssSelector("div.form_group>input")).sendKeys("nothing");
		driver.findElement(By.cssSelector("div.form_column div.form_group>input[placeholder^='Pass']")).sendKeys("something");
		driver.findElement(By.cssSelector("input#login-button")).click();
		Thread.sleep(2000);
		driver.close();



		
	}

}
