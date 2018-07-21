package com.qa.oht.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.oht.base.TestBase;
import com.qa.oht.pages.HomePage;

public class HomePageTest extends TestBase{

	HomePage homePage;
	
	//invokes superclass constructor
	public HomePageTest(){
		super();
	}
	
	//initialization method
	@BeforeMethod
	public void setUp(){
		initialization();
		homePage = new HomePage();
	}
	
	@Test(priority=1)
	public void validateHomePageTitletest(){
		homePage.verifyHomePageTitle();
	}
	
	@Test(priority=2)
	public void validateAboutUslinkTest(){
		homePage.aboutUsLink();
	}
	
	@Test(priority=3)
	public void validateContactLinkTest(){
		homePage.contactLink();
	}
	
	@Test(priority=4)
	public void validateFaqLinkTest(){
		homePage.fAQLink();
	}
	
	@Test(priority=5)
	public void validateTandCLinkTest(){
		homePage.TermsAndConditionsLink();
	}
	
	@Test(priority=6)
	public void validatesignOutLinkTest(){
		homePage.signOutLink();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
