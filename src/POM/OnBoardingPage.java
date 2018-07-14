package POM;

import org.openqa.selenium.By;

import Setup.Config;
import TestData.ReadExcel;

public class OnBoardingPage {

	ReadExcel r = new ReadExcel();

	public void DismissHelpOverlay() throws Exception {
		Config.driver.findElement(By.xpath(r.getExcelData("OnBoardingPage", 0, 1))).click();

	}

	public void ProfileOverlay() throws Exception {
		Config.driver.findElement(By.xpath(r.getExcelData("OnBoardingPage", 1, 1))).click();

	}

	public void LogOut() throws Exception {
		Config.driver.findElement(By.xpath(r.getExcelData("OnBoardingPage", 2, 1))).click();

	}

}
