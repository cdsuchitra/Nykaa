package com.IPT.GIT.NYKAA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserLogin extends NykaaBaseClass{
	
	public UserLogin(WebDriver driver_runner) {
		driver = driver_runner;
		PageFactory.initElements(driver, this);
	}
	
	//signIn
	@FindBy(xpath="//button[text()='Sign in']")
	private WebElement signIn;
	
	//signInMobile
	@FindBy(xpath="//button[text()='Sign in with Mobile / Email']")
	private WebElement signInMobile;

	//mobileNumber
	@FindBy(xpath="//input[@name='emailMobile']")
	private WebElement mobileNumber;
	
	//proceed
	@FindBy(xpath="//button[text()='proceed']")
	private WebElement proceed;
	
	//verify
	@FindBy(xpath="//button[text()='verify']")
	private WebElement verify;
	
	public WebElement getsignIn() {
		return signIn;
	}
	public WebElement getsignInMobile() {
		return signInMobile;
	}
	public WebElement getmobileNumber() {
		return mobileNumber;
	}
	public WebElement getproceed() {
		return proceed;
	}
	public WebElement getverify() {
		return verify;
	}
	
	

}
