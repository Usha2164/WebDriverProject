package test;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {
	
	public static void main (String[] args) {
		
		//Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize it
		driver.manage().window().maximize();
		
		//Navigate the application
		driver.get("https://whitecircleschool.com/dropdowndemo/");
		
		//select 'Switzerland' from the dropdown
		WebElement countries = driver.findElementByName("country");
		Select select = new Select(countries);
		select.selectByVisibleText("SWITZERLAND");
	}

}

