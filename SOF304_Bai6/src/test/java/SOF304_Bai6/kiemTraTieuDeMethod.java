package SOF304_Bai6;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class kiemTraTieuDeMethod {
	WebDriver webDriver;

	@Test
	public void kiemTraTieuDeMeThod() {
		String url = "https://ap.poly.edu.vn/";
		webDriver.get(url);

		assertEquals(webDriver.getTitle(), "Cao đẳng FPT Polytechnic");
	}

	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		webDriver = new ChromeDriver();
	}

	@AfterMethod
	public void afterMethod() {
		webDriver.close();
	}

}
