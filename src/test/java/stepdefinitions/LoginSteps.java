package stepdefinitions;

import io.cucumber.java.en.*;

import org.testng.Assert;

import pages.LoginPage;

public class LoginSteps {

	LoginPage login;

	@Given("User is on login page")
	public void user_on_login_page() {

		login = new LoginPage();
		login.openLoginPage();

	}

	@When("User enters username {string}")
	public void enter_username(String username) {

		login.enterUsername(username);

	}

	@When("User enters password {string}")
	public void enter_password(String password) {

		login.enterPassword(password);

	}

	@When("User clicks login button")
	public void click_login() {

		login.clickLogin();

	}

	@Then("User should see login success")
	public void verify_login() {

		Assert.assertTrue(login.verifyLogin());

	}

}