package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Setup.Config;
import TestData.ReadExcel;

public class SignUpPage {

	ReadExcel r = new ReadExcel();

	public void Email(String email) throws Exception {
		Config.driver.findElement(By.id(r.getExcelData("SignUpPage", 0, 1))).clear();
		Config.driver.findElement(By.id(r.getExcelData("SignUpPage", 0, 1))).sendKeys(email);

	}

	public void Name(String name) throws Exception {
		Config.driver.findElement(By.id(r.getExcelData("SignUpPage", 1, 1))).clear();
		Config.driver.findElement(By.id(r.getExcelData("SignUpPage", 1, 1))).sendKeys(name);

	}

	public void Password(String pass) throws Exception {
		Config.driver.findElement(By.id(r.getExcelData("SignUpPage", 2, 1))).clear();
		Config.driver.findElement(By.id(r.getExcelData("SignUpPage", 2, 1))).sendKeys(pass);

	}

	public String EmailInvalidMsg() throws Exception {
		return Config.driver.findElement(By.xpath(r.getExcelData("SignUpPage", 3, 1))).getText();

	}

	public String NameErrormsg() throws Exception {
		return Config.driver.findElement(By.xpath(r.getExcelData("SignUpPage", 4, 1))).getText();

	}

	public String PassRequired() throws Exception {
		return Config.driver.findElement(By.xpath(r.getExcelData("SignUpPage", 5, 1))).getText();

	}

	public String PassTooShort() throws Exception {
		return Config.driver.findElement(By.xpath(r.getExcelData("SignUpPage", 6, 1))).getText();

	}

	public String AlreadyUsedEmail() throws Exception {
		return Config.driver.findElement(By.xpath(r.getExcelData("SignUpPage", 7, 1))).getText();

	}

	public WebElement Submit() throws Exception {
		return Config.driver.findElement(By.cssSelector(r.getExcelData("SignUpPage", 8, 1)));

	}

	public void NewAccount() throws Exception {
		Config.driver.findElement(By.xpath(r.getExcelData("SignUpPage", 9, 1))).click();

	}

}
