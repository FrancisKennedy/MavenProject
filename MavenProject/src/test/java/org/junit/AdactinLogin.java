package org.junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinLogin {
	static WebDriver driver;
	
	@BeforeClass
	public static void beforeclass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/SearchHotel.php");
		driver.manage().window().maximize();
		System.out.println("BeforeClass executing the login page");
	}
	@AfterClass
	public static void afterclass() {
		driver.quit();
		System.out.println("Afterclass executed close this webpage");
	}
	@Test
	public  void login() {
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("franciskennedy");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Keny@1395");
		WebElement loginbutton = driver.findElement(By.name("login"));
		loginbutton.click();
		System.out.println("Test executed");
	}
	@Before
	public void before() {
		System.out.println("Before");
		long starttime = System.currentTimeMillis();
		System.out.println(starttime);
	}
	@After
	public void after() {
		System.out.println("After");
		long endtime = System.currentTimeMillis();
		System.out.println(endtime);
	}
	
	
	
	
	}
