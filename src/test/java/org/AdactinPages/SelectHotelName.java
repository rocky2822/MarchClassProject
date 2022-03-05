package org.AdactinPages;

import org.BaseClass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelName extends BaseClass {

	public SelectHotelName() {
		
		PageFactory.initElements(driver, this);
		
	}
		
		@FindBy(id="radiobutton_1")
		private WebElement clckradiobtn;
		
		@FindBy(id="continue")
		private WebElement btnclickcontinue;	
		
		public WebElement getBtnclickcontinue() {
			return btnclickcontinue;
		}

		public WebElement getClckradiobtn() {
			return clckradiobtn;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}
	