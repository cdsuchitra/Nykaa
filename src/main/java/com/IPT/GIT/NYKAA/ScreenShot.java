package com.IPT.GIT.NYKAA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScreenShot extends NykaaBaseClass {

	public  ScreenShot(WebDriver driver_runner){
		
		driver = driver_runner;
		PageFactory.initElements(driver,this);
	}
	//clickClose
	@FindBy(xpath="//button[text()='Close']")
	private WebElement clickClose;

	public WebElement getclickClose() {
		return clickClose;
	}
	
}

