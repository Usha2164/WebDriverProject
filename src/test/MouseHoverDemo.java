package test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {
	
	public static void main (String[] args) {
		
		//Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//launch the browser
		driver.get("https://www.amazon.in/");
		
		//Hover pointer over 'Hello Sign In' menu
		WebElement helloSignIn = driver.findElementById("nav-link-accountList");
		Actions actions = new Actions(driver);
		actions.moveToElement(helloSignIn).build().perform();
		
		//Click on 'Sign in' button
		driver.findElementByLinkText("Sign in").click();
		
	}

}

