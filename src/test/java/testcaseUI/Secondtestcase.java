package testcaseUI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Secondtestcase {
	public static WebDriver driver; // using this we can avoid defining webdrivermanager for every browser we use.

	public static void main(String[] args) throws IOException {
			
 String browser = filepath();
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


	}

	public static String filepath() throws IOException {
		 File f = new File("C:\\eclipseworkspace\\Seleniummaven\\src\\test\\resources\\browserdetails.txt");
		 FileReader fr = new FileReader(f);
		 BufferedReader br = new BufferedReader(fr);
		return (br.readLine());
		
	}

}
