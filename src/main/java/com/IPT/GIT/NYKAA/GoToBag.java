package com.IPT.GIT.NYKAA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoToBag extends NykaaBaseClass {
	
	
	
	public  GoToBag(WebDriver driver_runner){
		
			driver = driver_runner;
			PageFactory.initElements(driver,this);
		}
	
	//clickBag
	@FindBy(xpath="/html/body/div[1]/header/div/div[2]/div/div[2]/div[2]/button")
	private WebElement clickBag;
	
	//iFrame
	@FindBy(xpath="//iframe[@class='css-acpm4k']")
	private WebElement iFrame;
	
	//clickQuantity
	@FindBy(xpath="/html/body/div[1]/div/div/div[2]/div[3]/div/div/div[1]/div/div/div[3]/div/div[1]")
	private WebElement clickQuantity;
	
	//changeTo3
	@FindBy(xpath="//li[@class='css-18fuhjc edkwwn3'][3]")
	private WebElement changeTo3;
	
	//clickProceed
	@FindBy(xpath="/html/body/div[1]/div/div/div[3]/div/div/div/div[2]/button/div/div")
	private WebElement clickProceed;

	public WebElement getclickBag() {
		return clickBag;
	}

	public WebElement getiFrame() {
		return iFrame;
	}

	public WebElement getclickQuantity() {
		return clickQuantity;
	}

	public WebElement getchangeTo3() {
		return changeTo3;
	}

	public WebElement getclickProceed() {
		return clickProceed;
	}
	
	
}