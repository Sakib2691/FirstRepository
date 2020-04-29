package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XlConnection {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
FileInputStream fis=new FileInputStream("./Excel/New Microsoft Excel Worksheet.xlsx");
	Workbook wb= WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("Sheet1");
	String s=sh.getRow(0).getCell(0).getStringCellValue();
	System.out.println(s);		
	
	
	
	
	}
}
