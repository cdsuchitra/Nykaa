package com.IPT.GIT.NYKAA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends NykaaBaseClass {
	
	public PaymentPage(WebDriver driver_runner) {
		driver=driver_runner;
		PageFactory.initElements(driver,this);
	}
	
	//cardNum
	@FindBy(xpath="//input[@placeholder='Card Number']")
	private WebElement cardNum;
	
	//expiry
	@FindBy(xpath="//input[@placeholder='Expiry (MM/YY)']")
	private WebElement expiry;
	
	//cvv
	@FindBy(xpath="//input[@placeholder='CVV']")
	private WebElement cvv;
	
	//proceed
	@FindBy(xpath="//button[@class='css-v61n2j e8tshxd0']")
	private WebElement proceed;
	
	//proceedWithoutSavingCard
	@FindBy(xpath="//button[text()='Pay without securing card']")
	private WebElement proceedWithoutSavingCard;

	public WebElement getcardNum() {
		return cardNum;
	}

	public WebElement getexpiry() {
		return expiry;
	}

	public WebElement getcvv() {
		return cvv;
	}

	public WebElement getproceed() {
		return proceed;
	}

	public WebElement getproceedWithoutSavingCard() {
		return proceedWithoutSavingCard;
	}

//		
//		//enter card number
//		WebElement pP = driver.findElement(By.xpath("//input[@placeholder='Card Number']"));
//		pP.click();
//		pP.sendKeys("3566000020000410");
//		
//		Thread.sleep(3000);
//		
//		//enter expiry date
//		WebElement pP1 = driver.findElement(By.xpath("//input[@placeholder='Expiry (MM/YY)']"));
//		pP1.click();
//		pP1.sendKeys("02/26");
//		
//		Thread.sleep(3000);
//		
//		//enter cvv
//		WebElement pP2 = driver.findElement(By.xpath("//input[@placeholder='CVV']"));
//		pP2.sendKeys("123");
//		
//		//click proceed
//		WebElement pP3 = driver.findElement(By.xpath("//button[@class='css-v61n2j e8tshxd0']"));
//		pP3.click();
//		
//		//click the pop up window
//		WebElement pP4 = driver.findElement(By.xpath("//button[text()='Pay without securing card']"));
//		pP4.click();
//		
//		Thread.sleep(10000);
//		
//	}

}
