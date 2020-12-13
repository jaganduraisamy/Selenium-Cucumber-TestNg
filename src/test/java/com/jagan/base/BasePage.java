package com.jagan.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	public WebDriver driver;
	public WebDriverWait wait;
	
	public BasePage(org.openqa.selenium.WebDriver _driver) {
		PageFactory.initElements(_driver, this);
		this.driver = _driver;
		wait = new WebDriverWait(driver, 15);
	}
	
	//Click Method
	public void click(By elementLocation) {
		waitVisibility(elementLocation);
		driver.findElement(elementLocation).click();
	}
	
	//Write Text
	public void writeText(By elementLocation, String text) {
		waitVisibility(elementLocation);
		driver.findElement(elementLocation).sendKeys(text);
	}
	
	//Read Text
	public String readText(By elementLocation) {
		waitVisibility(elementLocation);
		return driver.findElement(elementLocation).getText();
	}
	
	//Wait
	public void waitVisibility(By by){
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	protected void waitForElementVisible(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	protected void waitForElementVisible(WebElement element, int timeOutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	public String getCurrentUrl() {	return driver.getCurrentUrl(); }
}
