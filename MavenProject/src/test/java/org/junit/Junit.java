package org.junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junit {
	static WebDriver driver;
	
	@BeforeClass
	public static void beforeclass() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		System.out.println("Before class executed");
		}
	@AfterClass
	public static void Afterclass() {
		driver.quit();
		System.out.println("After class executed");
	}
	
	@Test
	public void test1() {
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("Francis");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("keny@123");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
	}
	@Before
	public void bfore() {
		
		System.out.println("Before login");
		long startTime=System.currentTimeMillis();
		System.out.println(startTime);
				
	}
		
	@After
	public void after() {
		
		System.out.println("After logout");
		long endtime=System.currentTimeMillis();
		System.out.println(endtime);
		
	}
	
	
	
	
	
	

}
