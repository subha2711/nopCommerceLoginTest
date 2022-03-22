package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import page.HomePage;
import util.BrowserFactory;

public class LoginStepsDef {

	WebDriver driver;
	HomePage home;

	@Given("^user launches the nopcommerece site$")
	public void user_launches_the_nopcommerece_site(String url) throws Throwable {
		driver = BrowserFactory.init(url);
	}

	@When("^user enters the valid username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enters_the_valid_username_as_and_password_as(String uname, String password) throws Throwable {

		home = PageFactory.initElements(driver, HomePage.class);
		home.enterUserName(uname);
		home.enterUserPassword(password);
	}

	@When("^click on login$")
	public void click_on_login() throws Throwable {
		home = PageFactory.initElements(driver, HomePage.class);
		home.clickLoginButton();
	}

	@Then("^page title should be \"([^\"]*)\";$")
	public void page_title_should_be(String titleAfterLogin) throws Throwable {

//		if(driver.getPageSource().contains("Login was unsuccessful")) {
//			driver.close();
//			Assert.assertTrue(false);
//		}
//		else {
Assert.assertEquals(titleAfterLogin, driver.getTitle());
//		}
		
		
	}

	@When("^user click logout link$")
	public void user_click_logout_link() throws Throwable {
		home = PageFactory.initElements(driver, HomePage.class);
		home.clickLogoutButton();
		Thread.sleep(3000);
	}

	@Then("^user should be \"([^\"]*)\"$")
	public void user_should_be(String homePagetitle) throws Throwable {
//		if(driver.getPageSource().contains("Login was unsuccessful")) {
//			driver.close();
//			Assert.assertTrue(false);
//		}
//		else {
	Assert.assertEquals(homePagetitle, driver.getTitle());
//		}
			}

	@Then("^close browser$")
	public void close_browser() throws Throwable {
		BrowserFactory.tearDown();

	}

}
