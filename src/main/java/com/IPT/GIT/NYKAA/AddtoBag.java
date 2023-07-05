package com.IPT.GIT.NYKAA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddtoBag extends NykaaBaseClass {

	public AddtoBag(WebDriver driver_runner) {
		driver = driver_runner;
		PageFactory.initElements(driver, this);
	}
	
	//clickHimalaya
	@FindBy(xpath="//img[@alt='Himalaya Baby Powder']")
	private WebElement clickHimalaya;
	
	//select200
	@FindBy(xpath="//select[@class='css-2t5nwu']")
	private WebElement select200;
	
	//addIt
	@FindBy(xpath="//span[text()='Add to Bag'][1]")
	private WebElement addIt;

	public WebElement getclickHimalaya() {
		return clickHimalaya;
	}

	public WebElement getselect200() {
		return select200;
	}

	public WebElement getaddIt() {
		return addIt;
	}
	
	
}
