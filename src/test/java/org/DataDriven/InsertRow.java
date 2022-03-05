package org.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class InsertRow {
public static void main(String[] args) throws IOException {
	
	File file = new File("C:\\Users\\91978\\eclipse-FrameworkWorkspace\\SampleMavenFramework\\Datas\\Datas.xlsx");
	FileInputStream inputStream = new FileInputStream(file);
	Workbook workbook = new XSSFWorkbook(inputStream);
	Sheet sheet = workbook.getSheet("Sheet1");
	Row newrow = sheet.createRow(11);
	Row row = sheet.createRow(12);
	Cell newcell = newrow.createCell(0);
	newcell.setCellValue("Lokesh");
	
	FileOutputStream out = new FileOutputStream(file);
	workbook.write(out);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
