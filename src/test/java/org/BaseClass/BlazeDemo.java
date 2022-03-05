package org.BaseClass;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;

public class BlazeDemo {

	public static void main(String[] args) throws IOException {
		
		BaseClass baseclass = new BaseClass();
		
		baseclass.getDriver();
		
		baseclass.loadurl("https://blazedemo.com/");
		
		WebElement fromlocation = baseclass.findLocatorByName("fromPort");
		
		baseclass.selectByIndex(fromlocation, 0);
		
		WebElement tolocation = baseclass.findLocatorByName("toPort");
		
		baseclass.selectByIndex(tolocation, 0);
		
		WebElement btnfindflights = baseclass.findLocatorByXpath("//input[@value='Find Flights']");
		
		baseclass.click(btnfindflights);
		
		WebElement btnchoosetheflight = baseclass.findLocatorByXpath("(//input[@value='Choose This Flight'])[3]");
		
		baseclass.click(btnchoosetheflight);
		
		WebElement txtName = baseclass.findLocatorById("inputName");
		
		String getdata = baseclass.getdata("Sheet1", 1, 0);
		
         baseclass.type(txtName, getdata);	
		
		WebElement txtaddress = baseclass.findLocatorById("address");
		
		String getdata2 = baseclass.getdata("Sheet1", 1, 1);
		
		baseclass.type(txtaddress, getdata2);
		
		WebElement txtcity = baseclass.findLocatorById("city");
		
		String getdata3 = baseclass.getdata("Sheet1", 1, 2);
		
		baseclass.type(txtcity, getdata3);
		
		WebElement txtstate = baseclass.findLocatorById("state");
		
		String getdata4 = baseclass.getdata("Sheet1", 1, 3);
		
		baseclass.type(txtstate, getdata4);
		
		WebElement txtzipcode = baseclass.findLocatorById("zipCode");
		
		String getdata5 = baseclass.getdata("Sheet1", 1, 4);
		
		baseclass.type(txtzipcode, getdata5);
		
		WebElement dDncardtype = baseclass.findLocatorById("cardType");
		
		baseclass.selectByIndex(dDncardtype, 0);
		
		WebElement txtccnumber = baseclass.findLocatorById("creditCardNumber");
		
		String getdata6 = baseclass.getdata("Sheet1", 1, 5);
		
		baseclass.type(txtccnumber, getdata6);
		
		WebElement txtccmonth = baseclass.findLocatorById("creditCardMonth");
		
		String getdata7 = baseclass.getdata("Sheet1", 1, 6);
		
		baseclass.type(txtccmonth, getdata7);
		
		WebElement txtccyear = baseclass.findLocatorById("creditCardYear");
		
		String getdata8 = baseclass.getdata("Sheet1", 1, 7);
		
		baseclass.type(txtccyear, getdata8);
		
		WebElement txtNameoncard = baseclass.findLocatorById("nameOnCard");
		
		String getdata9 = baseclass.getdata("Sheet1", 1, 8);
		
		baseclass.type(txtNameoncard, getdata9);
		
		WebElement btnpurchaseflight = baseclass.findLocatorByXpath("//input[@value='Purchase Flight']");
		
		baseclass.click(btnpurchaseflight);
		
        WebElement idtext = baseclass.findLocatorByXpath("/html/body/div[2]/div/table/tbody/tr[1]/td[2]");
        String text = baseclass.getText(idtext);
        baseclass.writeData("Sheet1", 1, 9, text);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
