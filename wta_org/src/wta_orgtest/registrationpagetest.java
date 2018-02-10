package wta_orgtest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import wta_orglib.registrationpage;

public class registrationpagetest {
	@Test
	public void submitregform() {
		System.setProperty("webdriver.chrome.driver",
				"c:\\Users\\Ishwarya\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wta.org/@@register");
		registrationpage screenname = new registrationpage(driver);
		screenname.typescreenname("admin");
		registrationpage firstname = new registrationpage(driver);
		firstname.typefirstname("abc");
		registrationpage lastname = new registrationpage(driver);
		lastname.typelastname("pqr");
		registrationpage email = new registrationpage(driver);
		email.typeemail("abc.pqr@gmail.com");
		registrationpage zip = new registrationpage(driver);
		zip.typezip("34567");
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,600)");
		registrationpage sumbit = new registrationpage(driver);
		sumbit.clicksumbit();
		Assert.assertTrue(driver.getPageSource().contains("Error"));
		driver.close();
		
	}

}
