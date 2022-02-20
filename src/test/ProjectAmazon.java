package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectAmazon {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// Retrieve text from DB
       		 String dburl = "jdbc:mysql://localhost:3306/ecommerce";
		String username = "root";
		String password = "root";
		String query = "select * from myproducts;";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(dburl,username,password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		
		 
	  	//Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Navigate the application
      		  driver.get("https://www.amazon.in");
        
       		 while(rs.next()){
        
       		 //Searching the ecommerce from DB

driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys(rs.getString("ProductName"));
        driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).clear();
        }
        driver.quit();

	}
}

