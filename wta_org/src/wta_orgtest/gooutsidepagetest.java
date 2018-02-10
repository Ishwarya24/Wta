package wta_orgtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

import wta_orglib.gooutsidepage;

public class gooutsidepagetest {

	// Navigation test

	@Test(enabled = false)
	public void navtogooutsidepage()

	{
		System.setProperty("webdriver.chrome.driver",
				"c:\\Users\\Ishwarya\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wta.org/");
		gooutsidepage gooutside = new gooutsidepage(driver);
		gooutside.clickgooutsideoption();
		gooutsidepage hikermap = new gooutsidepage(driver);
		hikermap.clickhikefindermapsuboption();
		String url = driver.getCurrentUrl();
		Assert.assertEquals("https://www.wta.org/go-outside/map", url);
		driver.close();
	}

	// Functional test
	@Test
	public void searchhike() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"c:\\Users\\Ishwarya\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wta.org/go-outside/map");
		gooutsidepage searchtextbox = new gooutsidepage(driver);
		searchtextbox.textinsearchbox("big tree");
		Thread.sleep(2000);
		gooutsidepage gobutton = new gooutsidepage(driver);
		gobutton.clickgobutton();
		Thread.sleep(3000);
		driver.close();

	}

}
