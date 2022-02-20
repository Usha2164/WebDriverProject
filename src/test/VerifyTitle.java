package test;

	import org.openqa.selenium.chrome.ChromeDriver;

	public class VerifyTitle {
		
		public static void main(String[] args) {
			// 1)open the browser
			
			ChromeDriver driver = new ChromeDriver();
			//Navigate the application
			driver.get("https://www.linkedin.com/");
		
			//Verify user sees the title -LinkedIn: Log In or Sign Up
			String expectedTitle = "LinkedIn: Log In or Sign Up";
			String actualTitle = driver.getTitle();
			
			if(expectedTitle.equals(actualTitle)) {
				System.out.println("Testcase passed");
			}
				else
				{		
				System.out.println("Testcase failed");
			}
			driver.quit();
		}
	}



