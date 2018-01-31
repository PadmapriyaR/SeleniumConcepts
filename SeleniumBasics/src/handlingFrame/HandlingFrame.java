package handlingFrame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Studies\\Selenium with Java1.0\\JarFiles\\Upgraded\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/");
		driver.findElement(By.name("username")).sendKeys("padmapriya");
		driver.findElement(By.name("password")).sendKeys("padmapriya");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input")).click();
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//*[@id=\"navmenu\"]/ul/li[4]/a")).click();
		driver.quit();
	}

}

/* Notes:
 * 	Frame is another webelement.Inside of the frame, there will be more elements like text, button, images etc.
 * There is a different between page's element and frame's element.
 * 
 * Frame has 2 important properties.
 *  1.Index
 *  2.Name 
 *  Frame can have name also.
 *  
 * How to get to know it is frame?
 * 	 
 * 
 */
