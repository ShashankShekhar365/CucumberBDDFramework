package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverfactory.DriverFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage() {

		driver = DriverFactory.getDriver();

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "username")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginBtn;

	@FindBy(xpath = "//div[@class='flash success']")
	WebElement successMsg;

	public void openLoginPage() {

		driver.get("https://the-internet.herokuapp.com/login");

	}

	public void enterUsername(String user) {

		username.sendKeys(user);

	}

	public void enterPassword(String pass) {

		password.sendKeys(pass);

	}

	public void clickLogin() {

		loginBtn.click();

	}

	public boolean verifyLogin() {

		return successMsg.isDisplayed();

	}

}