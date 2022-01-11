package com.runner.org;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.org.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\java\\com\\feature\\org"},
		glue = {"com\\stepDefinition\\org"},
		tags = "@login or @cart",
		plugin = {"pretty" }, 
		monochrome = true
		)
public class Runner {
	public static WebDriver driver;

	@BeforeClass
	public static void getBrowser() {
		driver = Base_Class.browserLaunch("chrome");

	}

}
