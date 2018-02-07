package mouseMovementDragAndDrop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Studies\\Selenium with Java1.0\\JarFiles\\Upgraded\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
}

/* Notes:
 * -----
 * 	1.Page Load timeout ---> Timeout of page load. In this, we are telling to selenium to wait for maximum 40
 * seconds to wait for the pages to be loaded fully.
 * 
 * If the page got loaded within 40 seconds then rest of the seconds will be ignored. Else, selenium will
 * throw error.
 * 
 * 	2.Implicit Wait ----> It is applicable for all the elements which are available in the webpage. Once page
 * is fully loaded but the element/ajax component still is not loaded then this function will wait for the
 * given time to the element get loaded. If the element got loaded within the given time then rest of the time
 * will be ignored. Else, selenium will throw the error.
 * 
 * These two are global wait.
 * 
 * Thread ----> Even the element got visible within the given time, the rest of the seconds will not be ignored.
 * 
 */
