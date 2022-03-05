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

public class ReplaceData {
 
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\91978\\eclipse-FrameworkWorkspace\\SampleMavenFramework\\Datas\\Datas.xlsx");
		
		FileInputStream stream = new FileInputStream(file);
		
		Workbook workbook = new XSSFWorkbook(stream);
		
		Sheet sheet = workbook.getSheet("Sheet1");
		
		Row row = sheet.getRow(1);
		
		Cell cell = row.getCell(1);
		
		String value = cell.getStringCellValue();
		
		if (value.equals("E")) {
			
			cell.setCellValue("Elancheziyan");
			
		}
		
		FileOutputStream outputStream = new FileOutputStream(file);
		
		workbook.write(outputStream);
		
	}
	
	
}
