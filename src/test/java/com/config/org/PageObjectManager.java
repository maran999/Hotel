package com.config.org;

import org.openqa.selenium.WebDriver;

import com.pageObject.org.AddCart;
import com.pageObject.org.Login_pageObject;
import com.pageObject.org.SelectCategory;

public class PageObjectManager {
	public static WebDriver driver;
	
	private Login_pageObject login;
	private SelectCategory slt;
	private AddCart add;
	
	public PageObjectManager(WebDriver driver2) {
		this.driver=driver2;
		
	}

	public Login_pageObject getInstanceLogin() {
		 login = new Login_pageObject(driver);
       return login;
	}
	
	public SelectCategory getInstanceSltDress() {
		 slt = new SelectCategory(driver);
     return slt;
	}
	
	public AddCart getInstanceAddcart() {
		 add = new AddCart(driver);
        return add;
	}

}
