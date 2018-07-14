package Scripts;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import POM.HomePage;
import POM.LoginPage;
import POM.OnBoardingPage;
import POM.SignUpPage;
import Setup.Config;

public class SignInTCs {

	Config c = new Config();
	HomePage home = new HomePage();
	LoginPage login = new LoginPage();
	OnBoardingPage ob = new OnBoardingPage();
	SignUpPage signup = new SignUpPage();

	// Empty credentials
	@Test(priority = 6)
	public void SignIn_EmptyCredentials() throws Exception {

		Config.driver.get("https://dashboard.instabug.com/login");

		// signup.NewAccount();
		// Thread.sleep(1000);

		// ob.DismissHelpOverlay();
		// Thread.sleep(1000);

		// ob.ProfileOverlay();
		// Thread.sleep(1000);

		// ob.LogOut();
		// Thread.sleep(3000);

		Assert.assertTrue(!login.Submit().isEnabled());

	}

	// Validation for the email
	@Test(priority = 7)
	public void SignIn_InvalidEmailFormat() throws Exception {

		login.Email("xx" + Keys.TAB);
		Thread.sleep(3000);

		Assert.assertEquals(login.ValidEmailFormatError(), "Enter a valid email address.");

	}

	// Validation for the password
	@Test(priority = 8)
	public void SignIn_ShortPassword() throws Exception {

		login.Password("123" + Keys.TAB);
		Thread.sleep(3000);
		Assert.assertEquals(login.PassTooShort(), "Password must be 6 characters or more");

	}

	// Invalid Credentials
	@Test(priority = 9)
	public void SignIn_UnexistingAccount() throws Exception {

		login.Email("xx@xx.com");
		login.Password("12345678");
		Thread.sleep(1000);

		login.Submit().click();
		Thread.sleep(1000);

		Assert.assertEquals(login.InvalidCredentials(), "Your email and/or password are incorrect");

	}

	// Valid SignIn
	@Test(priority = 10)
	public void SignIn_Successfully() throws Exception {

		login.Email("saaif@mailinator.com");
		login.Password("12345678");
		Thread.sleep(1000);

		login.Submit().click();
		Thread.sleep(2000);

		Assert.assertTrue(Config.driver.getCurrentUrl().contains("Welcome-to-Instabug"));

	}

}
