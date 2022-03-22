package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	WebDriver driver;

	public HomePage() {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='Email']")
	WebElement userName;
	@FindBy(how = How.XPATH, using = "//input[@id='Password']")
	WebElement password;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Log in')]")
	WebElement loginButton;

	@FindBy(how = How.XPATH, using = "//*[@id=\"navbarText\"]/ul/li[3]/a")
	WebElement logout;

	public void enterUserName(String username) {
		userName.clear();
		userName.sendKeys(username);
	}

	public void enterUserPassword(String pwd) {
		password.clear();
		password.sendKeys(pwd);
	}

	public void clickLoginButton() {
		loginButton.click();
	}
	
//	public void verifyTitleAfterLogin(String afterloginTitle) throws InterruptedException {
//		Thread.sleep(3000);
//		System.out.println("title after login is*************** "+ afterloginTitle);
//	//	String afterLoginTitleofThePage = driver.getTitle();
//		//System.out.println("title after login is+++++++ "+ afterLoginTitleofThePage);
//		//Assert.assertEquals("not on right page",afterloginTitle ,driver.getTitle() );
//		Assert.assertEquals(afterloginTitle, driver.getTitle());
//	}

	public void clickLogoutButton() {
		logout.click();
	}

//	public void verifyHomePageTitle(String title) {
//	System.out.println("homepage tiytle is::::::::::::: "+ title);
//		String homePageTitle = driver.getTitle();
//		System.out.println("title after logging out is @@@@@@@@@"+ homePageTitle);
//		Assert.assertEquals("not on right page", title, homePageTitle);
//	}

	

}
