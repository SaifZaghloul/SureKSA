package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Setup.Config;
import TestData.ReadExcel;

public class HomePage {

	ReadExcel r = new ReadExcel();

	public WebElement SignUp() throws Exception {

		return Config.driver.findElement(By.xpath(r.getExcelData("HomePage", 0, 1)));
	}

	public WebElement SignIn() throws Exception {
		return Config.driver.findElement(By.xpath(r.getExcelData("HomePage", 1, 1)));
	}

}
