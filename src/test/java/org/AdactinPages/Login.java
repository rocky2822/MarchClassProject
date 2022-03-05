package org.AdactinPages;

import org.BaseClass.BaseClass;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClass {
public Login() {
	
	
	PageFactory.initElements(driver, this);
	
}
	public WebElement getTxtusername() {
	return txtusername;
}

	public WebElement getTxtpswd() {
	return txtpswd;
}

	public WebElement getBtnlogin() {
	return btnlogin;
}
	@FindBy(id="username")
	private WebElement txtusername;
	
	@FindBy(id="password")
	private WebElement txtpswd;
	
	@FindBy(id="login")
	private WebElement btnlogin;
	
	
	public void loginPage(String username,String password)
	{
	type(getTxtusername(),username);
	type(txtpswd, password);
	click(btnlogin);
	
	}
	
}
