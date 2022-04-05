package org.wait;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitConcept {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\franciskenny\\"
				+ "eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement name = driver.findElement(By.name("username"));
		name.sendKeys("frani_keny");
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("francis123");
		WebElement login = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button/div"));
		login.click();
		WebElement notNowclick = driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/div/div/div/button"));
		notNowclick.click();
		
	}

}