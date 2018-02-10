package wta_orgtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import wta_orglib.homepage;

public class homepagetest {
	// Navigation test-verifying when News is clicked user is navigated to the News
		// page
		@Test(enabled = true)
		public void navtonewspage() {
			System.setProperty("webdriver.chrome.driver",
					"c:\\Users\\Ishwarya\\Documents\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.wta.org/");
			homepage News = new homepage(driver);
			News.clicknews();
			String url = driver.getCurrentUrl();
			Assert.assertEquals(url, "https://www.wta.org/news");
			driver.close();
		}

		// Functional test-verifying the page url contains the text being searched
		@Test(enabled = true)
		public void Searchtext() {
			System.setProperty("webdriver.chrome.driver",
					"c:\\Users\\Ishwarya\\Documents\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.wta.org/");
			homepage Searchoption = new homepage(driver);
			Searchoption.clicksearchoption();
			homepage Searchtextbox = new homepage(driver);
			Searchtextbox.searchtextbox("about us");
			homepage Gobutton = new homepage(driver);
			Gobutton.clickgobutton();
			String url = driver.getCurrentUrl();
			Assert.assertEquals(url, "https://www.wta.org/@@search#gsc.tab=0&gsc.q=about%20us&gsc.page=1");
            driver.close();
		}
		// Navigation test-verifying when Donate is clicked user is navigated to the
		// Donate page

		@Test(enabled = true)
		public void navtodonatepage() {
			System.setProperty("webdriver.chrome.driver",
					"c:\\Users\\Ishwarya\\Documents\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.wta.org/");
			homepage Donate = new homepage(driver);
			Donate.clickdonateoption();
			driver.close();
			String url = driver.getCurrentUrl();
			Assert.assertEquals(url, "https://www.wta.org/get-involved/join/donatenow");
			driver.close();

		}

		// Content test
		@Test(enabled = true)
		public void mybackpackoption() {
			System.setProperty("webdriver.chrome.driver",
					"c:\\Users\\Ishwarya\\Documents\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.wta.org/");
			homepage mybackpack = new homepage(driver);
			mybackpack.clickmybackpackoption();
			Assert.assertTrue(driver.getPageSource().contains("Dashboard"));
			Assert.assertTrue(driver.getPageSource().contains("Trip"));
			Assert.assertTrue(driver.getPageSource().contains("login"));
			Assert.assertTrue(driver.getPageSource().contains("sign"));
			driver.close();
		}

		// content test
		@Test(enabled = true)
		public void contenttest() {
			System.setProperty("webdriver.chrome.driver",
					"c:\\Users\\Ishwarya\\Documents\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.wta.org/");
			Assert.assertTrue(driver.getPageSource().contains("Outside"));
			Assert.assertTrue(driver.getPageSource().contains("Work"));
			Assert.assertTrue(driver.getPageSource().contains("Involved"));
			Assert.assertTrue(driver.getPageSource().contains("Join"));
			driver.close();
		}

}
