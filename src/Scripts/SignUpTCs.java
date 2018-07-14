package Scripts;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import POM.HomePage;
import POM.LoginPage;
import POM.OnBoardingPage;
import POM.SignUpPage;
import Setup.Config;

public class SignUpTCs {

	Config c = new Config();
	HomePage home = new HomePage();
	LoginPage login = new LoginPage();
	OnBoardingPage ob = new OnBoardingPage();
	SignUpPage signup = new SignUpPage();

	@BeforeClass
	public void setUp() throws Exception {
		c.setUp("https://instabug.com/");

	}

	// Leaving all fields empty
	@Test(priority = 1)
	public void SignUp_EmptyFields() throws Exception {

		home.SignUp().click();
		Thread.sleep(5000);

		Assert.assertTrue(!signup.Submit().isEnabled());

	}

	// Validation for the email
	@Test(priority = 2)
	public void SignUp_InvalidEmailFormat() throws Exception {

		signup.Email("xx" + Keys.TAB);
		Thread.sleep(3000);

		Assert.assertEquals(signup.EmailInvalidMsg(), "Enter a valid email address.");

	}

	// Validation for the name
	@Test(priority = 3)
	public void SignUp_InvalidName() throws Exception {

		signup.Name(" " + Keys.TAB);
		Thread.sleep(3000);

		Assert.assertEquals(signup.NameErrormsg(), "Name is required.");

	}

	// Validation for the password
	@Test(priority = 4)
	public void SignUp_PasswordValidation() throws Exception {

		signup.Password("123" + Keys.TAB);
		Thread.sleep(3000);
		Assert.assertEquals(signup.PassTooShort(), "Password is too short (minimum is 8 characters).");

		signup.Password("" + Keys.TAB);
		Thread.sleep(3000);
		Assert.assertEquals(signup.PassRequired(), "Password is required.");

	}

	// Already registered email
	@Test(priority = 4)
	public void SignUp_AlreadyUsedEmail() throws Exception {

		signup.Email("saaif@mailinator.com");
		signup.Name("Saif");
		signup.Password("12345678");

		Thread.sleep(2000);
		signup.Submit().click();
		Thread.sleep(3000);

		Assert.assertEquals(signup.AlreadyUsedEmail(), "Email has already been taken");

	}

	/*
	// Register Successfully
	@Test(priority = 5)
	public void SignUp_SuccessRegistration() throws Exception {
	
		Random rand = new Random();
		int r = rand.nextInt(500);
	
		signup.Email("saaif" + r + "@mailinator.com");
		signup.Name("Saif");
		signup.Password("12345678");
	
		Thread.sleep(2000);
		signup.Submit().click();
		Thread.sleep(3000);
	
		Assert.assertTrue(Config.driver.getCurrentUrl().contains("Welcome-to-Instabug"));
	
	}
	*/

}
