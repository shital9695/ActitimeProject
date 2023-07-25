package com.Actitime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
//Declaration
	@FindBy(xpath="")
	private WebElement timetracktab;
	
	@FindBy(xpath="")
	private WebElement tasktab;
	
	@FindBy(xpath="")
	private WebElement reportstab;
	
	@FindBy(xpath="")
	private WebElement usertab;
	
	@FindBy(xpath="")
	private WebElement lgoutlnk;
	

//Initialization
 public Homepage(WebDriver driver) {
	 PageFactory.initElements(driver, this);
 }
 
 //Utilization
 public WebElement getTimetracktab() {
	 return timetracktab;
 }
	 public WebElement  getTasktab() {
	 return tasktab;
	 }
     public WebElement getReportstab() {
     return reportstab;
     
     }
}
 
