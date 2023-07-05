package com.IPT.GIT.NYKAA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressForm extends NykaaBaseClass {
	
	public AddressForm(WebDriver driver_runner) {
		
		driver = driver_runner;
		PageFactory.initElements(driver,this);
	}
	//clickDeliverHere
	@FindBy(xpath="//button[text()='Deliver here']")
	private WebElement clickDeliverHere;

	public WebElement getclickDeliverHere() {
		return clickDeliverHere;
	}

}
