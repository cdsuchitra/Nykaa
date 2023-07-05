package com.IPT.GIT.NYKAA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClearBag extends NykaaBaseClass{
	
	public ClearBag(WebDriver driver_runner) {
		driver = driver_runner;
		PageFactory.initElements(driver, this);
	}
	
	//clickBag
	@FindBy(xpath="/html/body/div[2]/div/div/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/p")
	private WebElement clickBag;
	
	//clickEdit
	@FindBy(xpath="//p[text()='Edit']")
	private WebElement clickEdit;
	
	//clickDelete
	@FindBy(xpath="//div[@data-test-id='product-remove']")
	private WebElement clickDelete;
	
	//clickRemove
	@FindBy(xpath="//button[text()='Remove']")
	private WebElement clickRemove;

	public WebElement getclickBag() {
		return clickBag;
	}

	public WebElement getclickEdit() {
		return clickEdit;
	}

	public WebElement getclickDelete() {
		return clickDelete;
	}

	public WebElement getclickRemove() {
		return clickRemove;
	}
	

}
