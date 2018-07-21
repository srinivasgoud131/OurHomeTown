package com.qa.oht.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.oht.base.TestBase;

public class HomePage extends TestBase {
	//creating pagefactory
	@FindBy(xpath = "//a[text()='About Us']")
	WebElement clickOnAboutLink;
	
	@FindBy(xpath = "//img[contains(@title, 'Native')]")
	WebElement ohtLogo;

	@FindBy(xpath = "//a[contains(text(),'FAQ')]")
	WebElement clickOnFAQLink;

	@FindBy(xpath = "//a[contains(text(),'T&C')]")
	WebElement clickOnTCLink;

	@FindBy(xpath = "//a[contains(text(),'Contact')]")
	WebElement clickOnContactLink;
	
	@FindBy(xpath="//a[contains(text(),'Sign')]")
	WebElement clickOnSignOutLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public AboutUsPage aboutUsLink() {
		clickOnAboutLink.click();
		return new AboutUsPage();
	}
	
	public FAQsPage fAQLink() {
		clickOnFAQLink.click();
		return new FAQsPage();
	}
	
	public TermAndCondPage TermsAndConditionsLink() {
		clickOnTCLink.click();
		return new TermAndCondPage();
	}
	
	public ContactPage contactLink() {
		clickOnContactLink.click();
		return new ContactPage();
	}
	
	public boolean verifyohtLogo() {
		return ohtLogo.isDisplayed();
	}
	
	public HomePage signOutLink() {
		clickOnSignOutLink.click();
		return new HomePage();
	}
		
}