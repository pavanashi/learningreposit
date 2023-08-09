package xpathtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class Axesmethodsxpath {
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

		/*
		 * driver.get("https://www.rakuten.com/"); driver.manage().window().maximize();
		 * WebElement text= driver.findElement(By.xpath("//a[@title='Ulta Beauty']"));
		 * Actions ae = new Actions(driver); ae.moveToElement(text);
		 * ae.build().perform();
		 */ // in this way you can move to particular position on same page
		driver.get("https://www.seleniumeasy.com/selenium-tutorials");
		driver.manage().window().maximize();
		// using parent xpath method (you can find xpath for parent webelement)
		driver.findElement(By.xpath("//span[@class='icon-bar']//parent::button[@type='button']"));
		// using chil xpath method (you can find xpath for its chil or subchild)
		driver.findElement(By.xpath("//div[@class='navbar-header']//child::div[@class='region region-navigation']"));
		driver.findElement(By.xpath("//div[@class='navbar-header']//child::span[@class='sr-only']"));
		// using self path method (you can find xpath of webelement in current tag)
		driver.findElement(By.xpath("//div[@class='region region-navigation']//self::h3"));
		// using descendant xpath method (you can find xpath of child, grand child etc
		// in current tag tree)
		driver.findElement(By.xpath("//div[@class='col-sm-5 header-section']//descendant::a"));
		// using descendant-or-self xpath method (you can find xpath of child, grand
		// child etc including current tag)
		driver.findElement(By.xpath("//div[@class='col-sm-5 header-section']//descendant-or-self::a"));
		
		//like wise we have following xpath methods
		/*ancestor,
		 * ancestor-or-self,
		 * following
		 * following-sibiling,
		 * preceeding
		 * preceeding-sibiling
		 */
		 

	}
}
