package test;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMessage {
	
	public static void main(String[] args) {
	// 1)Open the browser
	
		ChromeDriver driver = new ChromeDriver();

	// 2)Navigate the application
		driver.get("https://facebook.com");
		
	// 3)Enter and invalid username - batman554466@gmail.com
		driver.findElementById("email").sendKeys("batman554466@gmail.com");
		
	// 4)Enter and invalid password - password123
		driver.findElementById("pass").sendKeys("password123");
	
	// 5)Click on Login button
		driver.findElementByName("login").click();
	
	// 6)Verify error message - Invalid username or password - is displayed.
		
		String expectedErrorMessage = "Invalid username or password";
		String actualErrorMessage = driver.findElementByCssSelector("#error_box > div:nth-child(2)").getText();
		
		if(expectedErrorMessage.equals(actualErrorMessage)) {
			System.out.println("Testcase passed");
		}
		else
		{
			System.out.println("Testcase failed");
		}
		//close the browser
			driver.quit();
	}
}

