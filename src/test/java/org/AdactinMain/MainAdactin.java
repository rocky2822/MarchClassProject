package org.AdactinMain;

import org.AdactinPages.BookHotel;
import org.AdactinPages.Login;
import org.AdactinPages.OrderId;
import org.AdactinPages.SearchHotel;
import org.AdactinPages.SelectHotelName;
import org.BaseClass.BaseClass;
import org.openqa.selenium.WebElement;

public class MainAdactin extends BaseClass {

public static void main(String[] args) {

	BaseClass baseClass = new BaseClass();
	
	baseClass.getDriver();
    baseClass.loadurl("http://adactinhotelapp.com/index.php");
    baseClass.maximise();
    
    Login login = new Login();                             		 	 //1st page
    
    WebElement txtusername = login.getTxtusername();
    baseClass.type(txtusername, "naveen53");	
	
	WebElement txtpswd = login.getTxtpswd();
	baseClass.type(txtpswd, "C1IZAU");
	
	WebElement btnlogin = login.getBtnlogin();
	baseClass.click(btnlogin);
	
	SearchHotel searchHotel= new SearchHotel();               		   //2nd page
	
	WebElement getdDnlocation = searchHotel.getdDnlocation();
	baseClass.select(getdDnlocation);	
	baseClass.selectByIndex(getdDnlocation, 1);
	
	WebElement getdDnhotels = searchHotel.getdDnhotels();
	baseClass.select(getdDnhotels);
	baseClass.selectByIndex(getdDnhotels, 0);
	
	WebElement getdDNroomtype = searchHotel.getdDNroomtype();
	baseClass.select(getdDNroomtype);
	baseClass.selectByIndex(getdDNroomtype, 1);
	
	WebElement getdDnroomno = searchHotel.getdDnroomno();
	baseClass.select(getdDnroomno);
	baseClass.selectByIndex(getdDnroomno, 1);
	
	WebElement txtdatepickin = searchHotel.getTxtdatepickin();
	baseClass.type(txtdatepickin, "04/03/2022");
	
	WebElement txtdatepickout = searchHotel.getTxtdatepickout();
	baseClass.type(txtdatepickout, "06/03/2022");
	
	WebElement getdDnadultroom = searchHotel.getdDnadultroom();
	baseClass.select(getdDnadultroom);
	baseClass.selectByIndex(getdDnadultroom, 1);
	
	WebElement getdDnchildroom = searchHotel.getdDnchildroom();
	baseClass.select(getdDnchildroom);
	baseClass.selectByIndex(getdDnchildroom, 1);
	
	WebElement btnclicksearch = searchHotel.getBtnclicksearch();
	baseClass.click(btnclicksearch);
	
	SelectHotelName selectHotelName = new SelectHotelName();              //3rd page
	
	WebElement clckradiobtn = selectHotelName.getClckradiobtn();
	baseClass.click(clckradiobtn);
	
	WebElement btnclickcontinue = selectHotelName.getBtnclickcontinue();
	baseClass.click(btnclickcontinue);
	
	BookHotel bookHotel = new BookHotel();                                //4th page
	
	WebElement txtfirstname = bookHotel.getTxtfirstname();
	baseClass.type(txtfirstname, "Rakesh");
	
	WebElement txtlastname = bookHotel.getTxtlastname();
	baseClass.type(txtlastname, "E");
	
	WebElement txtaddress = bookHotel.getTxtaddress();
	baseClass.type(txtaddress, "porur");
	
	WebElement txtccnum = bookHotel.getTxtccnum();
	baseClass.type(txtccnum, "1234567894569874");
	
	WebElement getdDncctype = bookHotel.getdDncctype();
	baseClass.select(getdDncctype);
	baseClass.selectByIndex(getdDncctype, 1);
	
	WebElement getdDnexpmonth = bookHotel.getdDnexpmonth();
	baseClass.select(getdDnexpmonth);
	baseClass.selectByIndex(getdDnexpmonth, 1);
	
	WebElement getdDnexpyear = bookHotel.getdDnexpyear();
	baseClass.select(getdDnexpyear);
	baseClass.selectByIndex(getdDnexpyear, 12);
	
	WebElement txtcvv = bookHotel.getTxtcvv();
	baseClass.type(txtcvv, "123");
	
	WebElement btnclickbooknow = bookHotel.getBtnclickbooknow();
	baseClass.click(btnclickbooknow);
	
	baseClass.implicityWait(300);
	
	OrderId orderId = new OrderId();
	
	WebElement orderid2 = orderId.getOrderid();
	
	String attribute = baseClass.getAttribute(orderid2);
	
	System.out.println(attribute);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
}
