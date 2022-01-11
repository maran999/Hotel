package com.stepDefinition.org;

import org.openqa.selenium.WebDriver;

import com.baseclass.org.Base_Class;
import com.config.org.PageObjectManager;
import com.pageObject.org.AddCart;
import com.pageObject.org.SelectCategory;
import com.runner.org.Runner;

import io.cucumber.java.en.*;

public class StepDefinition extends Base_Class {
	public static WebDriver driver = Runner.driver;

	PageObjectManager pom = new PageObjectManager(driver);

	@When("user want to launch the application")
	public void user_want_to_launch_the_application() {
		getUrl("http://automationpractice.com/index.php");
	}

	@When("^user want to click the signin button$")
	public void user_want_to_click_the_signin_button() throws Throwable {
		click(pom.getInstanceLogin().getSignIn());
	}

	@When("^user want to enter vaild email address$")
	public void user_want_to_enter_vaild_email_address() throws Throwable {
		sendKeys(pom.getInstanceLogin().getEmail(), "manimaran@gmail.com");

	}

	@When("^user want to enter valid password$")
	public void user_want_to_enter_valid_password() throws Throwable {
		sendKeys(pom.getInstanceLogin().getPassword(), "password");
	}

	@Then("^user want to verify the login credential$")
	public void user_want_to_verify_the_login_credential() throws Throwable {
		click(pom.getInstanceLogin().getSubmit());

	}
	//****Select Category****//
	
	
	@When("user mouse hover to women category")
	public void user_mouse_hover_to_women_category() {
	   actionMoveTo(pom.getInstanceSltDress().getWomen());
	}
	@When("user want to select the summer dresses")
	public void user_want_to_select_the_summer_dresses() {
	   actionClick(pom.getInstanceSltDress().getSummerDresses());
	}
	
	///****Add to Cart***//
	//AddCart add = new AddCart(driver);
	
	@When("user move over on the summer dress")
	public void user_move_over_on_the_summer_dress() {
	    actionMoveTo(pom.getInstanceAddcart().getSumDress());
	}
	@When("user want to press the addcart button")
	public void user_want_to_press_the_addcart_button() {
	   actionClick(pom.getInstanceAddcart().getAddCart());
	}

}
