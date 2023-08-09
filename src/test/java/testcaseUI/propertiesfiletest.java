package testcaseUI;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class propertiesfiletest {
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		Properties pr = new Properties();
		FileInputStream read = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\details.properties");
		pr.load(read);
		String browser = pr.getProperty("browser");
	    String url = pr.getProperty("url");
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if (browser.equals("edge")) {
			driver = new EdgeDriver();	
		}
		else if (browser.equals("ie")) {
			driver = new InternetExplorerDriver();
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		// this will applicable for all the webelements while finding 
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		WebElement web = driver.findElement(By.xpath("//a[text()='Motors']"));
		Actions act = new Actions(driver);
		act.moveToElement(web).perform();
		WebElement web2 = driver.findElement(By.xpath("//a[text()='Body and frame']"));
		web2.click();
	  
	
		

	}

}
