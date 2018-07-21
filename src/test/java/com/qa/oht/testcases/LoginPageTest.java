package com.qa.oht.testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.oht.base.TestBase;
import com.qa.oht.pages.HomePage;
import com.qa.oht.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
	}

	@Test(priority=1)
	public void validateLoginPageTitleTest() {
		loginPage.loginOht(prop.getProperty("username"), prop.getProperty("password"));
		loginPage.verifyLoginPageTitle();
	}

	@Test(priority=2)
	public void validateHomePageLinkTest() {
		loginPage.clickOnHomePageLink();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}