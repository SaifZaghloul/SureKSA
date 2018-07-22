package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Setup.Config;
import TestData.ReadExcel;

public class Cart {

	ReadExcel r = new ReadExcel();

	public WebElement CheckOut() throws Exception {
		return Config.driver.findElement(By.xpath(r.getExcelData("Cart", 0, 1)));
	}

	public WebElement CheckOut2() throws Exception {
		return Config.driver.findElement(By.xpath(r.getExcelData("Cart", 1, 1)));
	}

	public WebElement PaymentContinue() throws Exception {
		return Config.driver.findElement(By.xpath(r.getExcelData("Cart", 2, 1)));
	}

	public WebElement ShippingContinue() throws Exception {
		return Config.driver.findElement(By.xpath(r.getExcelData("Cart", 3, 1)));
	}

	public WebElement CheckBox() throws Exception {
		return Config.driver.findElement(By.xpath(r.getExcelData("Cart", 4, 1)));
	}

	public WebElement ShipmentMethod() throws Exception {
		return Config.driver.findElement(By.xpath(r.getExcelData("Cart", 5, 1)));
	}

	public WebElement PaymentMethod() throws Exception {
		return Config.driver.findElement(By.xpath(r.getExcelData("Cart", 6, 1)));
	}

	public WebElement ConfirmOrder() throws Exception {
		return Config.driver.findElement(By.xpath(r.getExcelData("Cart", 7, 1)));
	}

}
