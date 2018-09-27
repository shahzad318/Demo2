package com.avecode.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.avecode.base.TestBase;

public class MainPage extends TestBase {
	
    //Sign In Button
	@FindBy(xpath="//a[contains(text(),'Sign In')]")
	WebElement signInButton;
	
	public MainPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateMainPageTitle(){
		return driver.getTitle();
	}
	
	public SignInPage clickMainPageSignInButton(){
		signInButton.click();
		return new SignInPage();
		
		
	}

	
	
}
