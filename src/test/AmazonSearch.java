package test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			        
	        WebDriver driver = new ChromeDriver();
	        //WebDriver driver = new FirefoxDriver();
	        driver.get("https://www.Amazon.in");    
	        
	        //Maximize window
	        driver.manage().window().maximize();
	        
	        //wait for browser to load - implicit
	        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	        WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	        search.sendKeys("iphone 12");
	        
	        WebElement searchclick=driver.findElement(By.id("nav-search-submit-button"));
	        searchclick.click();
	        
	        List<WebElement> Phonename=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	        List<WebElement> Phoneprice=driver.findElements(By.xpath("//span[@class='a-price-whole']"));    
	                
	        System.out.println("Search Results "+Phonename.size());
	        
	  for(int count=0;count<Phonename.size();count++)
	        {
	            if(Phonename.get(count).getText().toLowerCase().contains("iphone 12"))
	            {
	                System.out.println("IPhone Name :"+Phonename.get(count).getText() + " IPhone Price:"+Phoneprice.get(count).getText() );
	            }
	        }
	        
	        driver.close();
		}
}		