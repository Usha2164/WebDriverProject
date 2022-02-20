package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {
	
	public static void main (String[] args) throws InterruptedException {
			//Open the browser
			ChromeDriver driver = new ChromeDriver();
				
			//Maximize it
			driver.manage().window().maximize();
				
			//Navigate the application
			driver.get("https://www.trivago.in/");
			
			//Wait for cookie box to slide up completely
			Thread.sleep(3000);
			
			//Close the cookie confirmation box
			driver.findElementById("onetrust-accept-btn-handler").click();
			//Select 19th of next month from CalendaZ.rS<-r
			//Click on the Calendar icon-
			driver.findElementByXPath("//button[contains(@key,'checkInButton')]").click();
			
			//locate upcoming month
			WebElement comingMonth = driver.findElementByXPath("(//table[contains(@class,'cal-month')])[2]");
			
			//Get all the rows from coming month and put them in a list
			List<WebElement> rows = comingMonth.findElements(By.tagName("tr"));
			
			//Pick up one row at a time from the list of rows
			boolean dateSelected = false;
			for (int i=0; i<=rows.size(); i++) {
				WebElement row = rows.get(i);
				
				//From the list of selected row, now create a new list of all the td tags(cell values)
				List<WebElement> columns = row.findElements(By.tagName("td"));
				
				//Iterate  through all the values of the new list and check if it contains '19'
				for(WebElement x : columns) {
					if (x.getText().equals("19")) {
						x.click();
						dateSelected = true;
						break;
					}
				}
				if(dateSelected == true) {
					break;
				}
							
			}
				
	}

}

