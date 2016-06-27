package com.cadence.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CosLoginPage {

	@FindBy (xpath="//input[@id='pgId:frmId:iptTxt']")
	private WebElement loginId;

	public WebElement getLoginId(){
		return loginId;
	}
	
	@FindBy (xpath="//input[@class='cadencelogintxtboxstyle' and @type='password']")
	private WebElement passowrd;

	public WebElement getPassword(){
		return passowrd;
	}

	@FindBy (id="submitbtnen")
	private WebElement loginButton;

	public WebElement getLoginButton(){
		return loginButton;
	}
	
	//verify the updat for GIT 6/27/2016 12:15 desktop rs
	
	
	
}
