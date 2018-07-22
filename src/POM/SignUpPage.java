package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Setup.Config;
import TestData.ReadExcel;

public class SignUpPage {

	ReadExcel r = new ReadExcel();

	public void FirstName(String fname) throws Exception {
		Config.driver.findElement(By.name(r.getExcelData("SignUpPage", 0, 1))).clear();
		Config.driver.findElement(By.name(r.getExcelData("SignUpPage", 0, 1))).sendKeys(fname);
		Thread.sleep(1000);

	}

	public void LastName(String lname) throws Exception {
		Config.driver.findElement(By.name(r.getExcelData("SignUpPage", 1, 1))).clear();
		Config.driver.findElement(By.name(r.getExcelData("SignUpPage", 1, 1))).sendKeys(lname);
		Thread.sleep(1000);
	}

	public void Email(String mail) throws Exception {
		Config.driver.findElement(By.xpath(r.getExcelData("SignUpPage", 2, 1))).clear();
		Config.driver.findElement(By.xpath(r.getExcelData("SignUpPage", 2, 1))).sendKeys(mail);
		Thread.sleep(1000);
	}

	public void Telephone(String tel) throws Exception {
		Config.driver.findElement(By.name(r.getExcelData("SignUpPage", 3, 1))).clear();
		Config.driver.findElement(By.name(r.getExcelData("SignUpPage", 3, 1))).sendKeys(tel);
		Thread.sleep(1000);
	}

	public void Address(String add) throws Exception {
		Config.driver.findElement(By.name(r.getExcelData("SignUpPage", 4, 1))).clear();
		Config.driver.findElement(By.name(r.getExcelData("SignUpPage", 4, 1))).sendKeys(add);
		Thread.sleep(1000);
	}

	public void City(String city) throws Exception {
		Config.driver.findElement(By.name(r.getExcelData("SignUpPage", 5, 1))).clear();
		Config.driver.findElement(By.name(r.getExcelData("SignUpPage", 5, 1))).sendKeys(city);
		Thread.sleep(1000);
	}

	public void Country(String count) throws Exception {
		WebElement mySelectElement = Config.driver.findElement(By.name(r.getExcelData("SignUpPage", 6, 1)));
		Select dropdown = new Select(mySelectElement);
		dropdown.selectByVisibleText(count);
		Thread.sleep(1000);
	}

	public void Zone(String zone) throws Exception {
		WebElement mySelectElement = Config.driver.findElement(By.name(r.getExcelData("SignUpPage", 7, 1)));
		Select dropdown = new Select(mySelectElement);
		dropdown.selectByVisibleText(zone);
		Thread.sleep(1000);
	}

	public WebElement Submit() throws Exception {
		return Config.driver.findElement(By.xpath(r.getExcelData("SignUpPage", 8, 1)));

	}

	public WebElement Password() throws Exception {
		Thread.sleep(1000);
		return Config.driver.findElement(By.xpath(r.getExcelData("SignUpPage", 9, 1)));

	}

	public WebElement Password2() throws Exception {
		Thread.sleep(1000);
		return Config.driver.findElement(By.name(r.getExcelData("SignUpPage", 10, 1)));

	}

	public WebElement GoHome() throws Exception {
		Thread.sleep(1000);
		return Config.driver.findElement(By.xpath(r.getExcelData("SignUpPage", 11, 1)));

	}

}
