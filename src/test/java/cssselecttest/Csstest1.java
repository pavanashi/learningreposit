package cssselecttest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Csstest1 {

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
		driver.findElement(By.cssSelector("input[class='input_error form_input']")).sendKeys("firstname");
		
		driver.findElement(By.cssSelector("input[class='input_error form_input'][placeholder='Password']")).sendKeys("password");
		driver.findElement(By.cssSelector("input[id='login-button']")).click();
		//driver.findElement(By.cssSelector("input#login-button")).click();


		
	}

}
