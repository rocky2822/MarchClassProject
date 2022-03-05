package org.AdactinPages;

import org.BaseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends BaseClass {
public BookHotel() {
PageFactory.initElements(driver, this);
}


@FindBy(id="first_name")
private WebElement txtfirstname;

@FindBy(id="last_name")
private WebElement txtlastname;

@FindBy(id="address")
private WebElement txtaddress;

@FindBy(id="cc_num")
private WebElement txtccnum;

@FindBy(id="cc_type")
private WebElement dDncctype;

public WebElement getBtnclickbooknow() {
	return btnclickbooknow;
}


@FindBy(id="cc_exp_month")
private WebElement dDnexpmonth;

@FindBy(id="cc_exp_year")
private WebElement dDnexpyear;

@FindBy(id="cc_cvv")
private WebElement txtcvv;

@FindBy(id="book_now")
private WebElement btnclickbooknow;


public WebElement getTxtfirstname() {
	return txtfirstname;
}

public WebElement getTxtlastname() {
	return txtlastname;
}

public WebElement getTxtaddress() {
	return txtaddress;
}

public WebElement getTxtccnum() {
	return txtccnum;
}

public WebElement getdDncctype() {
	return dDncctype;
}

public WebElement getdDnexpmonth() {
	return dDnexpmonth;
}

public WebElement getdDnexpyear() {
	return dDnexpyear;
}

public WebElement getTxtcvv() {
	return txtcvv;
}







}
