package alertPopUpHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandling {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Studies\\Selenium with Java1.0\\JarFiles\\Upgraded\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();

		//Handling Alert popup
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
			
		//Handling window popup
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.name("fileupload")).sendKeys("D:\\imp.txt");
		//driver.quit();
	}
}

/* Selenium can not handle window popup (example, after clicking on browser button, we will get a window popup to
 * select the files)
 * The popup which we are seeing like error message and all part of browser. Selenium can handle this using
 * alert popup.
 * 
 */