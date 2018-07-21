package com.qa.oht.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.oht.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(xpath = "//a[contains(text(), 'SignIn')]")
	WebElement clickOnSignin;

	@FindBy(name = "userId")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//button[text()='Login']")
	WebElement loginBtn;

	@FindBy(xpath = "//a[contains(text(),'create')]")
	WebElement creatAccBtn;

	@FindBy(xpath = "//a[text()='Home']")
	WebElement homePageLink;
	
	@FindBy(xpath = "//a[contains(text(),'My Account')]")
	WebElement clickOnMyAccountLink;

	@FindBy(xpath = "//a[contains(text(),'My Orders')]")
	WebElement clickOnMyOrdersLink;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyLoginPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage loginOht(String un, String pwd) {
		clickOnSignin.click();
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();

		return new HomePage();

	}

	public HomePage clickOnHomePageLink() {
		homePageLink.click();

		return new HomePage();
	}

}