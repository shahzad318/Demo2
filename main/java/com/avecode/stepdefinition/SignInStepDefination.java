package com.avecode.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.avecode.base.TestBase;
import com.avecode.pages.MainPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SignInStepDefination extends TestBase{
	
    MainPage mainPage;
	
	WebDriver driver;
	
	@Given("^User is already on Main Page$")
	public void user_is_already_on_Main_Page() {
		TestBase.initialization();
	   
	}

	@When("^title of Main Page is ToDo Rails And Angular$")
	public void title_of_Main_Page_is_ToDo_Rails_And_Angular() {
		String title = mainPage.validateMainPageTitle();
		Assert.assertEquals(title, "ToDo Rails and Angular");
	    
	}

	@Then("^User clicks Sign In button$")
	public void user_clicks_Sign_In_button() throws Throwable {
		mainPage.clickMainPageSignInButton();
	   
	}




}
