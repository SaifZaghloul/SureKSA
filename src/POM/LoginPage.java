package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Setup.Config;
import TestData.ReadExcel;

public class LoginPage {

	ReadExcel r = new ReadExcel();

	public void Email(String email) throws Exception {
		Config.driver.findElement(By.id(r.getExcelData("LoginPage", 0, 1))).clear();
		Config.driver.findElement(By.id(r.getExcelData("LoginPage", 0, 1))).sendKeys(email);

	}

	public void Password(String pass) throws Exception {
		Config.driver.findElement(By.id(r.getExcelData("LoginPage", 1, 1))).clear();
		Config.driver.findElement(By.id(r.getExcelData("LoginPage", 1, 1))).sendKeys(pass);

	}

	public String ValidEmailFormatError() throws Exception {
		return Config.driver.findElement(By.xpath(r.getExcelData("LoginPage", 2, 1))).getText();

	}

	public String PassTooShort() throws Exception {
		return Config.driver.findElement(By.xpath(r.getExcelData("LoginPage", 3, 1))).getText();

	}

	public String InvalidCredentials() throws Exception {
		return Config.driver.findElement(By.xpath(r.getExcelData("LoginPage", 4, 1))).getText();

	}

	public WebElement Submit() throws Exception {
		return Config.driver.findElement(By.xpath(r.getExcelData("LoginPage", 5, 1)));

	}

}
