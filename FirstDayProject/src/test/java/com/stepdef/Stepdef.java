package com.stepdef;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.common.Base;
import com.pageobjectmodel.PageObjectModel;
import com.util.ScreenShot;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef extends Base {
	 PageObjectModel m;
	@Given("^go to home page$")
	public void go_to_home_page() throws Throwable {
		getDriver();
	  m=PageFactory.initElements(driver, PageObjectModel.class);
	}

	@When("^user able to enter email$")
	public void user_able_to_enter_email() throws Throwable {
	  m.getEmail().sendKeys("syed.a.sakib");
	   Thread.sleep(3000);
	   ScreenShot.scshot(driver, "username");
	   
	   
	}

	@When("^user able to enter password$")
	public void user_able_to_enter_password() throws Throwable {
	  m.getPassword()	.sendKeys("Spring2016@");   
	}

	@When("^user able to login$")
	public void user_able_to_login() throws Throwable {
	  m.getLogin().click();
	   
	}

	@Then("^login should be successful$")
	public void login_should_be_successful() throws Throwable {
	  
	   Assert.assertEquals(driver.getTitle(), "(1) Facebook");
	   System.out.println(driver.getTitle());
	}

}
