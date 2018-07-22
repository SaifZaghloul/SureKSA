package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Setup.Config;
import TestData.ReadExcel;

public class HomePage {

	ReadExcel r = new ReadExcel();

	public WebElement SignUp() throws Exception {

		return Config.driver.findElement(By.className(r.getExcelData("HomePage", 0, 1)));
	}

	public WebElement SignIn() throws Exception {
		return Config.driver.findElement(By.className(r.getExcelData("HomePage", 1, 1)));
	}

	public WebElement LogOut() throws Exception {
		return Config.driver.findElement(By.className(r.getExcelData("HomePage", 2, 1)));
	}

	public WebElement Email() throws Exception {
		return Config.driver.findElement(By.id(r.getExcelData("HomePage", 3, 1)));
	}

	public WebElement Password() throws Exception {
		return Config.driver.findElement(By.id(r.getExcelData("HomePage", 4, 1)));
	}

	public WebElement AddItem() throws Exception {
		return Config.driver.findElement(By.cssSelector(r.getExcelData("HomePage", 5, 1)));
	}

	public WebElement Cart() throws Exception {
		return Config.driver.findElement(By.xpath(r.getExcelData("HomePage", 6, 1)));
	}

	public WebElement WelcomeTitle() throws Exception {
		return Config.driver.findElement(By.className(r.getExcelData("HomePage", 7, 1)));
	}

}
