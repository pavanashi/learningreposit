package testcaseUI;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jaranddrivertest {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\\\downloads\\\\chrome-win64\\\\chrome.exe");
		
		//ChromeDriver cd = new ChromeDriver();
		//cd.get("https://www.google.com");
		WebDriverManager.iedriver().setup();
		InternetExplorerDriver ied = new InternetExplorerDriver();
		ied.get("https://www.facebook.com");
		
	}
	
	// instead of importing external jars i just added dependencies in pom.xml file.
	// instead of downloading webdrivers and defining set property evertime, i used dependenies in pom.xml file.
// this is advantage of using mavin dependencies instead of normal java project.

}
