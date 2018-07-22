package Scripts;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import POM.Cart;
import POM.HomePage;
import POM.SignUpPage;
import Setup.Config;

public class TCs {

	Config c = new Config();
	HomePage home = new HomePage();
	Cart cart = new Cart();
	SignUpPage signup = new SignUpPage();
	String email = null;
	String password = null;

	@BeforeClass
	public void setUp() throws Exception {
		c.setUp("https://compume.com.eg");
	}

	// Signing up
	@Test(priority = 1)
	public void SignUp() throws Exception {
		Random rand = new Random();
		int n = rand.nextInt(500) + 1;

		email = "saif" + n + "@mailinator.com";

		home.SignUp().click();
		Thread.sleep(3000);

		signup.FirstName("Saif");
		signup.LastName("Zaghloul");

		signup.Email(email);
		signup.Telephone("123456");
		signup.Address("1234S");
		signup.City("Cairo");
		signup.Country("Egypt");
		signup.Zone("6th of October");

		signup.Password().sendKeys("12345678");
		signup.Password2().sendKeys("12345678");

		signup.Submit().click();

		Assert.assertTrue(c.driver.getCurrentUrl().contains("success"));

	}

	// Signing in
	@Test(priority = 2)
	public void SignIn() throws Exception {
		home.LogOut().click();
		Thread.sleep(2000);

		// Enter username and password
		// email = "";
		// password = "";

		home.Email().sendKeys(email);
		home.Password().sendKeys(password);
		home.SignIn().click();

		Assert.assertTrue(home.WelcomeTitle().getText().contains("Saif"));
	}

	// Cart
	@Test(priority = 3)
	public void AddItemToCart() throws Exception {

		signup.GoHome().click();
		Thread.sleep(3000);

		home.AddItem().click();
		// home.Cart().click();
		Thread.sleep(3000);

		cart.CheckOut().click();
		cart.CheckOut2().click();
		cart.PaymentContinue().click();
		cart.ShippingContinue().click();
		cart.ShipmentMethod().click();
		cart.CheckBox().click();
		cart.PaymentMethod().click();

		Assert.assertNotNull(cart.ConfirmOrder());
	}

}
