package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https:\\\\www.facebook.com");
		Thread.sleep(2000);
		WebElement mailid = driver.findElement(By.id("email"));
		mailid.sendKeys("francis");
		driver.navigate().refresh();
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("keny");
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File scr = screenshot.getScreenshotAs(OutputType.FILE);
		File des = new File("F:\\sample.png");
		FileUtils.copyFile(scr, des);
	}
                                                                        
	
}
