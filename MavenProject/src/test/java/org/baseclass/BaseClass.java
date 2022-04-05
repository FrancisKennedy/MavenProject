package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
//import java.awt.AWTException;
//import java.awt.Robot;
//import java.awt.event.KeyEvent;
import java.sql.Driver;
import java.util.List;

import javax.naming.directory.DirContext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.Element;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver  ;
	public static Actions action = null;
	public static Select select= null;
	
	
public static String browserlaunch(String url) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get(url);
		return url;
	}
	public void maximize() {
		driver.manage().window().maximize();
	}
	public static WebElement findElementId(String id) {
		WebElement element = driver.findElement(By.id(id));
		return element;
		}
	public static WebElement findElementName(String name) {
		WebElement elementname = driver.findElement(By.name(name));
		return elementname;
	}
	public static String sendkeys(WebElement element, String id) {
		element.sendKeys(id);
		return id;
	}
	public static WebElement xpath(String xelementpath) {
		WebElement xelement = driver.findElement(By.xpath(xelementpath));
		return xelement;
	}
	public static void click(WebElement element) {
		element.click();	
	}
	public Navigation navigate() {
		Navigation navigate = driver.navigate();
		return navigate;
	}
	public String navigate_Url(String url) {
		navigate().to(url);
		return url;
	}
	public void backNavigate() {
		navigate().back();
	}
	public void forward() {
		navigate().forward();
	}
	public void refresh() {
	    navigate().refresh();
	} 
	public static void  mouseAction(WebElement get) {
		action.moveToElement(get).perform();
	}
	public  static  WebElement dragNdrop(WebElement src,WebElement dest) {
		action.dragAndDrop(src,dest ).perform();
		return src;
	}
	
	public static WebElement doubleClick(WebElement element) {
		action.doubleClick(element).perform();
		return element;
	}
	public static void contextClick(WebElement element) {
		action.contextClick(element).perform();
	}
	
	public Select select(WebElement element) {
		Select select = new Select(element);	
		return select;
	}
	public static void selectbyValue(String value) {
		select.selectByValue(value);
	}
	public static void selectbyindex(int index) {
		select.selectByIndex(index);		
	}
	public static void selectbytext(String text) {
		select.selectByVisibleText(text);
	}
	public void deselectValue(String value) {
		select.deselectByValue(value);
	}
	public String deselectText(String text) {
		select.deselectByVisibleText(text);	
		return text;
	}
	public int deselectIndex(int index) {
		select.deselectByIndex(index);
		return index;
	}
	public void firstselect() {
		select.getFirstSelectedOption();

	}
	
	public void getAllselect() {
		select.getAllSelectedOptions();
	}
	public void deselectAll() {
		select.deselectAll();
	}
	public String getoptions(String name) {
		List<WebElement> options = select.getOptions();
		for (WebElement webE : options) {
			String attribute = webE.getAttribute(name);		
		}
		return name;
	}
	public void robotEnter() throws AWTException {
		Actions a = new Actions(driver);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public void robotClose() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		}
	
	
	
	
	
	
	
	
	

}
