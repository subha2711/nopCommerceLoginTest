package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.*;
import page.DashboardPage;
import page.HomePage;
import util.BrowserFactory;

public class CustomerStepDef {

	WebDriver driver;
	HomePage hp;
	DashboardPage dashboard;
	
	@Given("^user lauches the browser$")
	public void user_lauches_the_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	 new  ChromeDriver();
	}

	@When("^user opens the app page \"([^\"]*)\"$")
	public void user_opens_the_app_page(String url) throws Throwable {
	driver=BrowserFactory.init(url);
	}

	@When("^user enters the email as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enters_the_email_as_and_password_as(String uname, String pwd) throws Throwable {
	  hp= PageFactory.initElements(driver, HomePage.class);
	  hp.enterUserName(uname);
	  hp.enterUserPassword(pwd);
	}

	@When("^click login$")
	public void click_login() throws Throwable {
		  hp= PageFactory.initElements(driver, HomePage.class);
		  hp.clickLoginButton();
	}

	@Then("^user can view dashboard$")
	public void user_can_view_dashboard() throws Throwable {
Assert.assertEquals	("Dashboard / nopCommerce administration", driver.getTitle());
	}

	@When("^user clicks on customer menu$")
	public void user_clicks_on_customer_menu() throws Throwable {
	   dashboard = PageFactory.initElements(driver, DashboardPage.class);
	   dashboard.clickCustomesButtonFromDashboard();
	}

	@When("^clicks customers menu item$")
	public void clicks_customers_menu_item() throws Throwable {
		  dashboard = PageFactory.initElements(driver, DashboardPage.class);
		  
		  dashboard.clickCustomestabButtonFromCustomersDropDownList();
	}

	@When("^click on add new button$")
	public void click_on_add_new_button() throws Throwable {
		 dashboard = PageFactory.initElements(driver, DashboardPage.class);
		 dashboard.clickAddNewButton();
	}

	@Then("^user can view add new customer page$")
	public void user_can_view_add_new_customer_page() throws Throwable {
		 dashboard = PageFactory.initElements(driver, DashboardPage.class);
		 Thread.sleep(4000);
		 Assert.assertEquals("Add a new customer / nopCommerce administration", driver.getTitle());
	}

	@When("^user enter customer info$")
	public void user_enter_customer_info() throws Throwable {
		 dashboard = PageFactory.initElements(driver, DashboardPage.class);
		 dashboard.enterEmail();
		 dashboard.enterPassword();
		 dashboard.enterFirstName();
		 dashboard.enterLastName();
		 dashboard.selectGender();
		 dashboard.enterCompany();
		 dashboard.selectTaxExempted();
		 
		 dashboard.selectCustomerRole();
		 dashboard.selectManagerVendor();
		 dashboard.selectactiveCheckBoxSelection();

		
	}

	@When("^click on save button$")
	public void click_on_save_button() throws Throwable {
		  dashboard = PageFactory.initElements(driver, DashboardPage.class);
		dashboard.clickSaveButton();
	}

	@Then("^User can view the confirmation message \"([^\"]*)\"$")
	public void user_can_view_the_confirmation_message(String arg1) throws Throwable {
	   Assert.assertTrue(false);
	}


}
