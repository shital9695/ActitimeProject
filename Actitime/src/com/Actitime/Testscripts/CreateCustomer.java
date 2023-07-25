package com.Actitime.Testscripts;

import org.testng.annotations.Test;
import com .Actitime.GenericLibrary.Baseclass;
import com.Actitime.GenericLibrary.FileLibrary;
import com.Actitime.ObjectRepository.Homepage;

public class CreateCustomer {
@Test
public void createcustomer(){
	Homepage hp=new Homepage();
	hp.getTasktab().click();
	tp.getAddnewbtn().click();
	FileLibrary f=new FileLibrary();
	 String name = f.readDataFromExcel("Mali2", 2, 1);
	 tp.getcustname().sendkeys(name);
	= f.readDataFromExcel"Mali2", 1, 1);
}
}
