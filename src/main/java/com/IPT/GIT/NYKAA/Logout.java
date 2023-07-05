package com.IPT.GIT.NYKAA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout extends NykaaBaseClass{
	
	public Logout(WebDriver driver_runner) {
		driver = driver_runner;
		PageFactory.initElements(driver, this);
	}
	
	//mouseOnLogout
	@FindBy(xpath="//span[@class='css-17ukzrr euw1lbv4']")
	private WebElement mouseOnLogout;
	
	//clickLogout
	@FindBy(xpath="//button[text()='Logout']")
	private WebElement clickLogout;
	
	//clickLogoutFromAll
	@FindBy(xpath="//span[text()='Logout from all devices']")
	private WebElement clickLogoutFromAll;
	
	public WebElement getmouseOnLogout() {
		return mouseOnLogout;
	}

	public WebElement getclickLogout() {
		return clickLogout;
	}

	public WebElement getclickLogoutFromAll() {
		return clickLogoutFromAll;
	}

	
}

