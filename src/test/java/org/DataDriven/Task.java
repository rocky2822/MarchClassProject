package org.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task {
	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\91978\\eclipse-FrameworkWorkspace\\SampleMavenFramework\\Datas\\Datas.xlsx");

		FileInputStream stream = new FileInputStream(file);

		Workbook workbook = new XSSFWorkbook(stream);

		org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheet("Sheet1");

		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);

			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {

				Cell cell = row.getCell(j);

				CellType type = cell.getCellType();

				switch (type) {
				case STRING:
					String data = cell.getStringCellValue();
					System.out.println(data);
					break;
				case NUMERIC:
					if (DateUtil.isCellDateFormatted(cell)) {
						java.util.Date date = cell.getDateCellValue();
						SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
						String dateinfo = dateFormat.format(date);
						System.out.println(dateinfo);

					}

					else {

						double d = cell.getNumericCellValue();
						BigDecimal b = BigDecimal.valueOf(d);
						String s = b.toString();
						System.out.println(s);
						break;
					}
				default:
					break;
				}

			}

		}

	}
}
