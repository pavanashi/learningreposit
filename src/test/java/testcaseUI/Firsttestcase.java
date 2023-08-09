package testcaseUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Firsttestcase {
	public static String browser = "chrome";

	public static WebDriver driver;

	public static void main(String[] args) {
		
		
		 if(browser.equals("chrome")) {
			 driver = new ChromeDriver();
			  }
		 else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		}
		 else if (browser.equals("ie")){
			 driver = new InternetExplorerDriver();
		 }
  driver.get("https://www.google.com");
  driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("facebook");
  driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
  driver.close();
  
  
  
	}

}
