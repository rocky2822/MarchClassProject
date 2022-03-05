package org.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

public class Adactin {

	public static void main(String[] args) throws IOException {
		
		BaseClass baseclass = new BaseClass();
		
		baseclass.getDriver();
		
		baseclass.loadurl("http://adactinhotelapp.com/");
		
		
	File file = new File("C:\\Users\\91978\\eclipse-FrameworkWorkspace\\SampleMavenFramework\\Datas\\Adactin.xlsx");
		
		FileInputStream stream = new FileInputStream(file);
		
		Workbook workbook = new XSSFWorkbook(stream);
		
		Sheet sheet = workbook.getSheet("Sheet1");
		
		
		baseclass.maximise();

		WebElement txtUser = baseclass.findLocatorById("username");
		String name = baseclass.getdata("Sheet1", 1, 0);
		baseclass.type(txtUser, name);

		WebElement txtpass = baseclass.findLocatorById("password");
		String pass = baseclass.getdata("Sheet1", 1, 1);
		baseclass.type(txtpass, pass);

		WebElement btnlogin = baseclass.findLocatorById("login");
		baseclass.click(btnlogin);

		WebElement dDnlocation = baseclass.findLocatorById("location");
		baseclass.click(dDnlocation);
		baseclass.selectByIndex(dDnlocation, 1);

		WebElement dDnhotel = baseclass.findLocatorById("hotels");
		baseclass.click(dDnhotel);
		baseclass.selectByIndex(dDnhotel, 1);

		WebElement dDnroom = baseclass.findLocatorById("room_type");
		baseclass.click(dDnroom);
		baseclass.selectByIndex(dDnroom, 1);

		WebElement dDnsubmit = baseclass.findLocatorById("Submit");
		baseclass.click(dDnsubmit);

		WebElement dDnSelec = baseclass.findLocatorByXpath("//input[@type='radio']");
		baseclass.click(dDnSelec);

		WebElement dDnContinue = baseclass.findLocatorById("continue");
		baseclass.click(dDnContinue);

		WebElement txtFirst = baseclass.findLocatorById("first_name");
		String fname = baseclass.getdata("Sheet1", 1, 2);
		baseclass.type(txtFirst, fname);

		WebElement txtLast = baseclass.findLocatorById("last_name");
		String lname = baseclass.getdata("Sheet1", 1, 3);
		baseclass.type(txtLast, lname);

		WebElement txtAddress = baseclass.findLocatorById("address");
		String address = baseclass.getdata("Sheet1", 1, 4);
		baseclass.type(txtAddress, address);

		WebElement txtcard = baseclass.findLocatorById("cc_num");
		String card = baseclass.getdata("Sheet1", 1, 5);
		baseclass.type(txtcard, card);

		WebElement Ddncc = baseclass.findLocatorById("cc_type");
		baseclass.click(Ddncc);
		baseclass.selectByIndex(Ddncc, 1);

		WebElement Ddnmonth = baseclass.findLocatorById("cc_exp_month");
		baseclass.click(Ddnmonth);
		baseclass.selectByIndex(Ddnmonth, 3);

		WebElement Ddnyear = baseclass.findLocatorById("cc_exp_year");
		baseclass.click(Ddnyear);
		baseclass.selectByIndex(Ddnyear, 12);

		WebElement txtcvv = baseclass.findLocatorById("cc_cvv");
		String cvv = baseclass.getdata("Sheet1", 1, 6);
		baseclass.type(txtcvv, cvv);

		WebElement Ddnbook = baseclass.findLocatorById("book_now");
		baseclass.click(Ddnbook);

		baseclass.implicityWait(300);

		WebElement dDnorder = baseclass.findLocatorById("order_no");
		String attribute = baseclass.getAttribute(dDnorder);
		baseclass.writeData("Sheet1", 1, 7, attribute);

	}
}