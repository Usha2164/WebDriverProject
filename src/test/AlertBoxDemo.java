package test;

import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxDemo {
	
	public static void main (String[] args) throws InterruptedException {
		
		//Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Navigate the application
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		
		//Click on 'CONTINUE TO LOGIN' button
		driver.findElementByLinkText("CONTINUE TO LOGIN").click();
		
		//Click on 'Login' button
		driver.findElementById("Button2").click();
		
		Thread.sleep(5000);
		//Close the alert box by click on OK button
		driver.switchTo().alert().accept();
		
		//Close the alert box by clicking on Cancel button
		//driver.switchTo().alert().dismiss();
		
	}

}

