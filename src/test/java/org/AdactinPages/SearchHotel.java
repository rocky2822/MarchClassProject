package org.AdactinPages;

import org.BaseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass {

	
	
	public SearchHotel() {

	PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(id="location")
	private WebElement dDnlocation;
	
	@FindBy(id="hotels")
	private WebElement dDnhotels;
	
	@FindBy(id="room_type")
	private WebElement dDNroomtype;
	
	@FindBy(id="room_nos")
	private WebElement dDnroomno;
	
	@FindBy(id="datepick_in")
	private WebElement txtdatepickin;
	
	@FindBy(id="datepick_out")
	private WebElement txtdatepickout;
	
	@FindBy(id="adult_room")
	private WebElement dDnadultroom;
	
	@FindBy(id="child_room")
	private WebElement dDnchildroom;

	@FindBy(id="Submit")
	private WebElement btnclicksearch;
	
	
	
	
	
	public WebElement getdDnlocation() {
		return dDnlocation;
	}

	public WebElement getdDnhotels() {
		return dDnhotels;
	}

	public WebElement getBtnclicksearch() {
		return btnclicksearch;
	}

	public WebElement getdDNroomtype() {
		return dDNroomtype;
	}

	public WebElement getdDnroomno() {
		return dDnroomno;
	}

	public WebElement getTxtdatepickin() {
		return txtdatepickin;
	}

	public WebElement getTxtdatepickout() {
		return txtdatepickout;
	}

	public WebElement getdDnadultroom() {
		return dDnadultroom;
	}

	public WebElement getdDnchildroom() {
		return dDnchildroom;
	}
		
		
		
}
