package test;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchingTabs {

	public static void main (String[] args) {
		//Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Navigate the application
		driver.get("https://facebook.com");
		
		//Click on the Instagram Hyperlink
		driver.findElementByLinkText("Instagram").click();
		
		//Switch focus on new tab
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		
		driver.findElementByName("username").sendKeys("abc@gmail.com");
		
	}
}

