package com.avecode.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.avecode.base.TestBase;

public class SignInPage extends TestBase{
	
	//Sign In Button
		@FindBy(xpath="//a[contains(text(),'Sign In')]")
		WebElement signInButton;
		
		//Email text field
		@FindBy(id="user_email")
		WebElement email;
		
		//Password text field
		@FindBy(id="user_password")
		WebElement password;
		
		//Click Sign In button
		@FindBy(xpath="//input[contains(@class, 'tn btn-primary')]")
		WebElement clickSignIn;
		
		public SignInPage(){
			PageFactory.initElements(driver, this);
		}
		
		public String validateMainPageTitle(){
			return driver.getTitle();
		}
		
		public WelcomePage signIn(String em, String pw){	
			email.sendKeys(em);
			password.sendKeys(pw);
			clickSignIn.click();
			
			return new WelcomePage();
			
			
			
		}
	

}