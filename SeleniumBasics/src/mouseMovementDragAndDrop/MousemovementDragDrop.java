package mouseMovementDragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousemovementDragDrop {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Studies\\Selenium with Java1.0\\JarFiles\\Upgraded\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://spicejet.com/");
		
		//Mouse Movement
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("ADD-ONS"))).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Hot Meals")).click();
		
		//Drag and Drop
		driver.get("http://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		Actions action1 = new Actions(driver);
		action1.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]")))
		.moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]")))
		.release().build().perform();	
		
		driver.quit();
	}
}
