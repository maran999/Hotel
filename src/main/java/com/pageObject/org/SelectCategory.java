package com.pageObject.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectCategory {
     public static WebDriver driver;
	
	@FindBy(xpath = "//a[@title='Women']")
	private WebElement women;
	
	@FindBy(xpath = "(//a[@title='Summer Dresses'])[1]")
	private WebElement summerDresses;

	public SelectCategory(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getWomen() {
		return women;
	}

	public WebElement getSummerDresses() {
		return summerDresses;
	}
}
