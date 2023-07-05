package com.IPT.GIT.NYKAA;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NykaaBaseClass {
	
	protected static WebDriver driver;
	JavascriptExecutor js;
	Alert alert;
	public Actions a;
	
	public void browserLaunch(String url) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	
	}
	public void clickElement(WebElement ele) {
		//if(ele.isEnabled()) {
			ele.click();
	//}
		
	}
	public void sendValue(WebElement ele,String search) {
		
		ele.sendKeys(search);
	}
	public void takeScreenshot(String filename) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Shravanthi\\eclipse-workspace\\IPT.GIT.NYKAA\\screenshot\\"+filename+".png");
		FileHandler.copy(src, des);
		
	}
	public void impWait(int sec) {
		
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}
	public void expWait(WebElement ele, int sec) {
		
		WebDriverWait wait = new WebDriverWait(driver,sec);
		wait.until(ExpectedConditions.visibilityOf(ele));
		
	}
	public void expWaitClick(WebElement ele, int sec) {
		
		WebDriverWait wait = new WebDriverWait(driver,sec);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
	}
	//scroll up, down, left, down
	public void JSExe(int x, int y) {
		
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+ x +","+ y +")");
		
	}//scroll to the end of the page
	public void JSExe(int x) {
		
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+",document.body.scrollHeight)");
		
	}
	//scroll into view
	public void JSExe(WebElement ele) {
		
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",ele);

	}
	public void JSEclick1(WebElement ele) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ele);
	}
	public void JSEclick2(String id) {
		js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('"+id+"').click();");
	}
	public void JSEsendKEys(String id, String value) {
		js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('"+id+"').value('"+value+"');");
	}
	public void simpleAlert() {
		alert = driver.switchTo().alert();
		alert.accept();
		
	}
	public void confirmAlert(String action) {
		
		if(action.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();
		}
		if(action.equalsIgnoreCase("dismiss")) {
			driver.switchTo().alert().dismiss();
		}
			
	}
	public void promptAlert(String sendKeys) {
		alert = driver.switchTo().alert();
		alert.sendKeys(sendKeys);
		
	}
	public void dropDown(WebElement ele,String select, String value) {
		
		Select s = new Select(ele);
		if(select.equals("text")){
			s.selectByVisibleText(value);
		}else if(select.equals("value")) {
			s.selectByValue(value);
		}else if (select.equals("index")) {
			int n = Integer.parseInt(value);
			s.selectByIndex(n);
		}
		
	}
	public void mouseOver(WebElement ele) {
		a=new Actions(driver);
		a.moveToElement(ele).build().perform();
	}
	public void switchWindow() {
		
		List<String> tabs = new LinkedList<>(driver.getWindowHandles());
		int size = tabs.size();
		driver.switchTo().window(tabs.get(size-1));
		
	}
	public void switchToFrame(String option,String value) {
		if(option.equals("index")) {
			int index = Integer.parseInt(value);
			driver.switchTo().frame(index);
		}else if ((option.equals("id"))||(option.equals("name"))){
			driver.switchTo().frame(value);
		}
		
	}
	
	public void switchFrameUsingElement(WebElement element) {
		driver.switchTo().frame(element);
	}
		
		
} 
