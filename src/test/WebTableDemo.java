package test;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {
	
	public static void main(String[] args) {
	//Open the browser
	ChromeDriver driver = new ChromeDriver();
	//Maxmize it
	driver.manage().window().maximize();
	//Navigate the application
	driver.get("https://bseindia.com/markets/debt/debt_corporate_EOD.aspx?curPage=1");
	
	//Click on 'LIQUIDETF' in the webtable
	//
	WebElement table = driver.findElementById("ContentPlaceHolder1_GridViewrcdsFC");
		List<WebElement> rows = table.findElements(By.tagName("tr"));
	//Pick one row at a time from the list of rows
	boolean valueFound = false;
	for(int i=1; i<rows.size(); i++) {
		WebElement row = rows.get(i);
		
	//From the selected row, now create a new list of all  the td tags (cell values)
		List<WebElement> columns = row.findElements(By.tagName("td"));
		
	//Iterage through all the values of the new list and check if it contains 'LIQUIDETF'
		for (WebElement x : columns) {
			if (x.getText().equals("LIQUIDETF")) {
				x.click();
				valueFound = true;
				break;
			}
		}
		if (valueFound == true) {
			break;
		}
	}
}
}
