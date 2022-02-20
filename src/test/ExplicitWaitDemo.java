package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
	
	public static void main(String[] args) {
		
		//Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//Navigate to the application
		driver.get("https://whitecircleschool.com/explicit-wait-demo1/");
		
		//Click on the start button
		driver.findElementById("start").click();
		
		//Verify Hello world appears on the screen
		String expectedText = "Hello World!";
		
		//Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish > h4")));
		
		String actualText = driver.findElementByCssSelector("#finish > h4").getText();
		
	System.out.println("Text read from actual page - " + actualText);
	
	if(expectedText.equals(actualText)) {
		System.out.println("Testcase passed");
	}
	else
	{
		System.out.println("Testcase failed");
	}
	driver.quit();
	}

}
