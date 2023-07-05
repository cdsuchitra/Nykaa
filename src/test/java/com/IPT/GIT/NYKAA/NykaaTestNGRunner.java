package com.IPT.GIT.NYKAA;

	
	import java.io.File;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.Set;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.io.FileHandler;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;
	 
	public class NykaaTestNGRunner extends NykaaBaseClass {
	
		PageObjectManager pom = new PageObjectManager();
		
		@Parameters({"url"})		
		@BeforeSuite
		public void bLaunch(String url) throws InterruptedException {
			browserLaunch(url);
		}
		
		@BeforeMethod
		public void bfMethod() {
			
			impWait(10);
		}
		//@Parameters("mobilenum")
		@Test
		public void loginSearch() throws InterruptedException {
			
			clickElement(pom.getUserClick().getsignIn());
			expWait(pom.getUserClick().getsignInMobile(),10);
			clickElement(pom.getUserClick().getsignInMobile());
			expWait(pom.getUserClick().getmobileNumber(),10);
			sendValue(pom.getUserClick().getmobileNumber(),"8778195182");
			expWait(pom.getUserClick().getproceed(),30);
			clickElement(pom.getUserClick().getproceed());
			Thread.sleep(20000);
			clickElement(pom.getUserClick().getverify());
			mouseOver(pom.getProductClick().getmomBaby());
			clickElement(pom.getProductClick().getbabyPowder());
		}
		
		@Test(dependsOnMethods = "loginSearch")
		public void addBag() throws InterruptedException {
			
			Thread.sleep(1000);
			switchWindow();
			JSExe(pom.getAddBagclick().getclickHimalaya());
			JSExe(0, -100);
			clickElement(pom.getAddBagclick().getclickHimalaya());
			switchWindow();
			dropDown(pom.getAddBagclick().getselect200(),"value","0");
			clickElement(pom.getAddBagclick().getaddIt());
			
		}
		
		@Test(dependsOnMethods = "addBag")
		public void goBag() {
			
			clickElement(pom.getGoBagClick().getclickBag());
			switchFrameUsingElement(pom.getGoBagClick().getiFrame());
			clickElement(pom.getGoBagClick().getclickQuantity());
			clickElement(pom.getGoBagClick().getchangeTo3());
			clickElement(pom.getGoBagClick().getclickProceed());
		}
		
		@Test(dependsOnMethods = "goBag")
		public void address() {
			
			clickElement(pom.getAddressclick().getclickDeliverHere());
			
		}
		@Parameters({"cardnum","expiry","cvv"})
		@Test(dependsOnMethods = "address")
		public void payment(String cardnum,String expiry,String cvv) {
			
			expWait(pom.getPaymentClick().getcardNum(),10);
			clickElement(pom.getPaymentClick().getcardNum());
			sendValue(pom.getPaymentClick().getcardNum(),cardnum);
			clickElement(pom.getPaymentClick().getexpiry());
			sendValue(pom.getPaymentClick().getexpiry(),expiry);
			clickElement(pom.getPaymentClick().getcvv());
			sendValue(pom.getPaymentClick().getcvv(),cvv);
			clickElement(pom.getPaymentClick().getproceed());
			clickElement(pom.getPaymentClick().getproceedWithoutSavingCard());
			
		}
		@Test(dependsOnMethods = "payment")
		public void picture() throws IOException {
		
			takeScreenshot("PaymentFail");
			clickElement(pom.getScreenClick().getclickClose());
		}
		@Test(dependsOnMethods = "picture")
		public void clear() {
			
			clickElement(pom.getClearclick().getclickBag());
			clickElement(pom.getClearclick().getclickEdit());
			clickElement(pom.getClearclick().getclickDelete());
			expWaitClick(pom.getClearclick().getclickRemove(),10);
			clickElement(pom.getClearclick().getclickRemove());

		}
		@Test(dependsOnMethods = "clear")
		public void signout() {
			
			mouseOver(pom.getLogoutClick().getmouseOnLogout());
			clickElement(pom.getLogoutClick().getclickLogout());
			clickElement(pom.getLogoutClick().getclickLogoutFromAll());
		}
				
		@AfterSuite
		public void quit() {
			
			driver.quit();
		}
}
	





