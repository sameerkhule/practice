package com.Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Library {
	
	public static void custom_sendkeys(WebElement element ,String fieldname,String value) {
		try {
			element.sendKeys(value);	
		}catch(Exception e) {
			System.out.println("unable to send value to "+fieldname);
		}	
	}
	
	public static void custom_click(WebElement element,String fieldname) {
		try {
			element.click();
		}catch(Exception e) {
			System.out.println("unable to click "+fieldname);	
		}
	}
	
	public static void custom_HandleDropDown(WebElement element,String text,String fieldname) {
		try {
			Select s=new Select(element);
			s.selectByVisibleText(text);
		}catch(Exception e) {
			System.out.println("unable to Handle DropDown "+fieldname);
		}
	}
	
	
	
	
	
	
	

}
