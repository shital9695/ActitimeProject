package com.Actitime.GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * 
 * @author Shital
 * this method is non static method designed to read data from property file.
 * @author Shital
 */
public class FileLibrary {
	
public String readDataFromPropertyFile1(String key) throws IOException  {
	FileInputStream fis=new FileInputStream("./TestData/commnData.property");
	Properties p=new Properties();
	p.load(fis);
	String value = p.getProperty(key);
	return value;
}

/**
 * this is a non-static method used a read from excel sheet
 * @param sheetname
 * @param row
 * @param cell
 * @return
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public String readDataFromPropertyFile(String sheetname, int row, int cell) throws IOException  {
	FileInputStream fis=new FileInputStream("./TestData/autotestdata.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
 String value=wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	return value;
}
}
