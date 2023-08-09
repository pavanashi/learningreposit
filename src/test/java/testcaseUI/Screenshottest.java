package testcaseUI;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Screenshottest {
	public static WebDriver driver;
	public static String browser;

	public static void main(String[] args) throws InterruptedException, IOException {
		browser = "chrome";
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		} else if (browser.equals("ie")) {
			driver = new InternetExplorerDriver();
		}

		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("div#gh-ac-box2>input[id='gh-ac']")).sendKeys("tee shirt");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot,new File("C:\\eclipseworkspace\\Seleniummaven\\screenshots\\screnn.png"));
		// if we re run the code exisitng screen shot will override with new screen shot in order to avoid that
		// we should use timestamp as screenshotname. to do this you should convert time stamp to string first 
		//and then use it in destinity file name while copying 
	}

}
