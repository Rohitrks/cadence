package com.cadence.objectrepository;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
public class CosSupportHomePage {
	

	
	@FindBy(css="#userIcon > span.user-chevron > i.fa.fa-chevron-down")
	private WebElement userIcon;
	
	public WebElement getUserIcon(){
		return userIcon;
	}
	
	@FindBy(css="div.action.sction-last")
	private WebElement logoutButton;
	
	public WebElement getLogoutButton(){
		return logoutButton;
	}
	
}