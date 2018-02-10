package wta_orglib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class gooutsidepage {
	WebDriver driver;

	public gooutsidepage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickgooutsideoption() {
		driver.findElement(By.xpath("//*[@id=\"portaltab-go-outside\"]/a")).click();
	}

	public void clickhikefindermapsuboption() {
		driver.findElement(By.xpath("//*[@id=\"portaltab-go-outside\"]/div/ul/li[1]/div/a")).click();
	}

	public void textinsearchbox(String findhike) {
		driver.findElement(By.xpath("//*[@id=\"map-filter-hike-name-search\"]/input")).sendKeys(findhike);
	}

	public void clickgobutton() {
		driver.findElement(By.xpath("//*[@id=\"map-filter-hike-name-search\"]/button")).click();
	}
}
