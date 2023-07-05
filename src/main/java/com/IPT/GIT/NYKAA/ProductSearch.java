package com.IPT.GIT.NYKAA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductSearch extends NykaaBaseClass {
	
	Actions a=new Actions(driver);
		
	public ProductSearch(WebDriver driver_runner) {
		driver = driver_runner;
		PageFactory.initElements(driver, this);
	}
	
	//momBaby
	@FindBy(xpath="//a[text()='mom & baby']")
	//mouse over mom and baby
	private WebElement momBaby;
	
	//babyPowder
	@FindBy(xpath="//a[text()='Baby Powder']")
	//click on baby powder
	private WebElement babyPowder;

	public WebElement getmomBaby() {
		return momBaby;
	}

	public WebElement getbabyPowder() {
		return babyPowder;
	}
		
		
	}


