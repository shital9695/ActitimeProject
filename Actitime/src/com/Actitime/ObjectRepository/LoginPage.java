package com.Actitime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
//declaration
	@FindBy(id="")
	private WebElement untbx;
	
	@FindBy(name="")
	private WebElement pwtbx;
	  
	@FindBy(xpath="")
	private WebElement lgbtn;
	
	//Initialization
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	
	public WebElement getUntbx() {
		return untbx;
	}
	public WebElement getPwtbx() {
		return pwtbx;
	}
	public WebElement getLgbtn() {
		return lgbtn;
	}
}
