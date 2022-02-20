package test;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonDemo {
	
	public static void main (String[] args) throws InterruptedException {
		
		//Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize it
		driver.manage().window().maximize();
		
		//Navigate the application
		driver.get("https://facebook.com");
		
		//Click on 'Create New Account' button
		driver.findElementByLinkText("Create New Account").click();
		
		//Wait for pop up to appear
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[contains(@type,'radio')])[2]")));
		
		//Click on Male radio button
		driver.findElementByXPath("(//input[contains(@type,'radio')])[2]").click();
	}
 
}

