package wta_orglib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homepage {
	WebDriver driver;
	By News = By.className("news");
	By Searchoption = By.className("search");
	By Searchtextbox = By.id("search-field");
	By Gobutton = By.tagName("button");
	By Donate = By.className("donate");
	By mybackpack = By.className("hiker");

	public homepage(WebDriver driver) {
		this.driver = driver;
	}

	public void clicknews() {
		driver.findElement(News).click();
	}

	public void clicksearchoption() {
		driver.findElement(Searchoption).click();
	}

	public void searchtextbox(String texttosearch) {
		driver.findElement(Searchtextbox).sendKeys(texttosearch);
	}

	public void clickgobutton() {
		driver.findElement(Gobutton).click();
	}

	public void clickdonateoption() {
		driver.findElement(Donate).click();
	}

	public void clickmybackpackoption() {
		driver.findElement(mybackpack).click();
	}
}
