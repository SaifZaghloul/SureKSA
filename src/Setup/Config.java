package Setup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {

	public static WebDriver driver;

	public void setUp(String url) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get(url);
		Thread.sleep(5000);
	}
}