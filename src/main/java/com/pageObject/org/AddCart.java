package com.pageObject.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCart {
	public static WebDriver driver;
	
	@FindBy(xpath = "(//div[@class='right-block'])[1]")
	private WebElement sumDress;
	
	@FindBy(xpath = "(//a[@class='button ajax_add_to_cart_button btn btn-default'])[1]")
	private WebElement addCart;

	public AddCart(WebDriver driver2) {
		this.driver =  driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getSumDress() {
		return sumDress;
	}

	public WebElement getAddCart() {
		return addCart;
	}

}
