package org.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ques1 {
public static void main(String[] args) throws IOException {
	
	File file = new File("C:\\Users\\91978\\eclipse-FrameworkWorkspace\\SampleMavenFramework\\Datas\\Ques1.xlsx");
	
	FileInputStream stream = new FileInputStream(file);
	
     Workbook workbook = new XSSFWorkbook(stream);
     
     Sheet sheet = workbook.getSheet("Sheet1");
     
     
     int rowcount = sheet.getPhysicalNumberOfRows();
     
     System.out.println("row count :"+ rowcount);
     
     Row row = sheet.getRow(10);
     
     int cellcount = row.getPhysicalNumberOfCells();
     System.out.println("cell count:"+cellcount);
     
     
     
    
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
