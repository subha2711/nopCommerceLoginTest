package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage extends BasePage {

	
	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver=driver;
	
	}
	
	@FindBy(how = How.XPATH, using ="/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a/p") WebElement Customersbutton;
	@FindBy(how = How.XPATH, using ="/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]/a/p") WebElement CustomersTabButton;
	@FindBy(how = How.XPATH, using ="//a[@class='btn btn-primary']") WebElement AddNewButton;
	@FindBy(how = How.XPATH, using ="//input[@id='Email']") WebElement email;
	@FindBy(how = How.XPATH, using ="//input[@id='Password']") WebElement password;
	@FindBy(how = How.XPATH, using ="//input[@id='FirstName']") WebElement firstname;
	@FindBy(how = How.XPATH, using ="//input[@id='LastName']") WebElement lastname;
	@FindBy(how = How.XPATH, using ="//input[@id='Gender_Female']") WebElement genderRadioButton;
	@FindBy(how = How.XPATH, using ="//input[@id='DateOfBirth']/following::span[1]") WebElement calenderDatePicker;
	@FindBy(how = How.XPATH, using ="//input[@id='Company']") WebElement company;
	@FindBy(how = How.XPATH, using ="//input[@id='IsTaxExempt']") WebElement taxExemptedChecxBox;
	@FindBy(how = How.XPATH, using ="//select[@id='SelectedNewsletterSubscriptionStoreIds']/parent::div/div") WebElement newsLetterDropdown;
	@FindBy(how = How.XPATH, using ="//select[@id='SelectedCustomerRoleIds']/parent::div") WebElement customerRoleDropdown;
	@FindBy(how = How.XPATH, using ="//select[@id='VendorId']") WebElement managerOfVendorDropDown;
	@FindBy(how = How.XPATH, using ="//*[@id=\"Active\"]") WebElement activeCheckBoxSelection;
	@FindBy(how = How.XPATH, using ="//textarea[@id='AdminComment']") WebElement textareaBox;
	@FindBy(how = How.XPATH, using ="//button[@name='save']") WebElement saveButton;
	
	public void clickCustomesButtonFromDashboard() {
		Customersbutton.click();
	}
	public void clickCustomestabButtonFromCustomersDropDownList() {
		waitForElement(driver, 5, CustomersTabButton);
		CustomersTabButton.click();
	}
	public void clickAddNewButton() {
		AddNewButton.click();
	}
	public void enterEmail() {
		email.sendKeys("abc@test.com");
	}
	public void enterPassword() {
		password.sendKeys("abc123");
	}
	public void enterFirstName() {
		firstname.sendKeys("suba");
	}
	public void enterLastName() {
		lastname.sendKeys("bala");
	}
	public void selectGender() {
		selectRadioButtonOption(genderRadioButton);
	}
	public void enterCompany() {
	company.sendKeys("tf");
	}
	public void selectTaxExempted() {
	selectCheckBox(taxExemptedChecxBox);
	}
	public void selectNewsLetter() {
		
	}
	public void selectCustomerRole() {
		selectFromDropdown(customerRoleDropdown, "Registered");
	}
	public void selectManagerVendor() {
		selectFromDropdown(managerOfVendorDropDown, "Vendor 2");
	}
	public void selectactiveCheckBoxSelection() {
		selectCheckBox(activeCheckBoxSelection);
	}
	public void writeIntoTextArea() {
		waitForElement(driver, 3, textareaBox);
		textareaBox.sendKeys("created");
	}
	public void clickSaveButton() {
		saveButton.click();
	}
}
