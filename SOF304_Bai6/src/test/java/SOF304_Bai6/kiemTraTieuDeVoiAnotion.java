package SOF304_Bai6;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class kiemTraTieuDeVoiAnotion {
	WebDriver webDriver;
	@Test
	public void kiemTraTieuDeAPVoiAnotion() {
		String url = "https://ap.poly.edu.vn/";
		webDriver.get(url);

		assertEquals(webDriver.getTitle(), "Cao đẳng FPT Polytechnic");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Start Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Stop Method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Start Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Stop Class");
	}

	@BeforeTest
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		webDriver = new ChromeDriver();
		System.out.println("Start Test");
	}

	@AfterTest
	public void afterTest() {
		webDriver.close();
		System.out.println("Stop Test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Start Suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Stop Suite");
	}

}
