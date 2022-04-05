package org.junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinBooking {
	static WebDriver driver;
	
	
	@BeforeClass
//	public static void beforeclass() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("http://adactinhotelapp.com/index.php");
//		driver.manage().window().maximize();
//		System.out.println("BeforeClass executing the login page");
//	}
//	@AfterClass
//	public static void afterclass() {
//		driver.quit();
//		System.out.println("Afterclass executed close this webpage");
//	}
	@Test
	public   void searchHotel() {
		WebElement location = driver.findElement(By.name("location"));
		Select s = new Select(location);
		s.selectByValue("Sydney");		
	}
	
	@Test
	public void Hotel() {
	
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select s2 = new Select(hotels);
		s2.selectByValue("Hotel Hervey");
	}
		
	@Test
	public void rooms() {

		WebElement roomType = driver.findElement(By.name("room_type"));
		Select s3 = new Select(roomType);
		s3.selectByVisibleText("Deluxe");
		
	}
				
			
}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
