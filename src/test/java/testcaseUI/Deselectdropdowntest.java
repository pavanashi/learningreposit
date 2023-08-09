package testcaseUI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselectdropdowntest {
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
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		WebElement sedr = driver.findElement(By.className("product_sort_container"));
		Select se = new Select(sedr);
		se.selectByValue("az");
		Thread.sleep(2000);
		se.selectByVisibleText("Price (low to high)");
		List<WebElement> alloptions= se.getOptions();
		for(WebElement obj: alloptions) {
			System.out.println(obj.getText()); // in this case its not printing in console because website has not text in html code
		}
		driver.quit();
		
		

	}

}
