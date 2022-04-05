package org.baseclass;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BaseTesting extends BaseClass{
	
	public static void main(String[] args) {
		browserlaunch("http://leafground.com/pages/drop.html");
		WebElement drag = xpath("//p[text()='Drag me to my target']");
		WebElement drop = xpath("//p[text()='Drop here']");	
		WebElement dd = dragNdrop(drag, drop);
		System.out.println(dd);
	}
	

}
