package test;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static void main (String[] args) {
		//Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Navigate the application
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		//Go inside the frame
		driver.switchTo().frame("classFrame");
		
		//Click on DEPRECTED hyperlink
		driver.findElementByLinkText("DEPRECATED").click();
		
		//Come out of the existing frame
		driver.switchTo().defaultContent();
		
		//Go to another frame
		driver.switchTo().frame("packageFrame");
		
		//Scrolling down the page till the element is found
		
		WebElement Element = driver.findElement(By.linkText("OpaqueKey"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		
		//Click on the OpaqueKey in the new frame
		driver.findElementByLinkText("OpaqueKey").click();
	}	
}		
		

