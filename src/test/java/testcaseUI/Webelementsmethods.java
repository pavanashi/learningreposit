package testcaseUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Webelementsmethods {
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
			driver.findElement(By.id("APjFqb")).sendKeys("seleniumdev");
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[1]/div/a/h3")).click();
			driver.manage().window().maximize();
			System.out.println(driver.findElement(By.xpath("//*[@id=\"announcement-banner\"]/div/div/div/h4/a")).getAttribute("target"));
			System.out.println(driver.findElement(By.xpath("//*[@id=\"announcement-banner\"]/div/div/div/h4/a")).getTagName());

		}

}
