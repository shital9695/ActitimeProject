package com.Actitime.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaskPage {
@FindBy(xpath = "//div[.='Add New']")
private WebElement addnewbtn;

@FindBy(xpath  = "//div[@class='item createNewCustomer']")
private WebElement  newcust;

@FindBy(xpath  = "(//input[@placeholder='Enter Customer Name'])[2]")
private WebElement  custname;

@FindBy(xpath  = "//textarea[@placeholder='Enter Customer Description']")
private WebElement  custdesp;

@FindBy(xpath  = "//div[.='Create Customer']")
private WebElement  createcustbtn;

@FindBy(xpath  = "//div[@class='greyButton cancelBtn']")
private WebElement  cancelbtn;

 

//initialization

public WebElement getAddnewbtn() {
	return addnewbtn;
}

public void setAddnewbtn(WebElement addnewbtn) {
	this.addnewbtn = addnewbtn;
}

public WebElement getNewcust() {
	return newcust;
}

public void setNewcust(WebElement newcust) {
	this.newcust = newcust;
}

public WebElement getCustname() {
	return custname;
}

public void setCustname(WebElement custname) {
	this.custname = custname;
}

public WebElement getCustdesp() {
	return custdesp;
}

public void setCustdesp(WebElement custdesp) {
	this.custdesp = custdesp;
}

public WebElement getCreatecustbtn() {
	return createcustbtn1;
}

public void setCreatecustbtn(WebElement createcustbtn) {
	this.createcustbtn1 = createcustbtn;
}

public WebElement getCancelbtn() {
	return cancelbtn;
}

public void setCancelbtn(WebElement cancelbtn) {
	this.cancelbtn = cancelbtn;
}


}
