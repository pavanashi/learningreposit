package xpathtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Containstest {
	public static WebDriver driver;
	public static String browser;

	public static void main(String[] args) {

		browser = "chrome";
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		} else if (browser.equals("ie")) {
			driver = new InternetExplorerDriver();
		}

		driver.get("https://www.seleniumeasy.com/selenium-tutorials");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[contains(@title,'Enter the terms you wish to search for.')]"))
				.sendKeys("getwindowhandle");
		driver.findElement(By.xpath("//span[contains(@class,'icon glyphicon glyphicon-search')]")).click();
		
	}
}
