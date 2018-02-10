package wta_orglib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class registrationpage {
	WebDriver driver;

	public registrationpage(WebDriver driver) {
		this.driver = driver;
	}

	public void typescreenname(String sname) {
		driver.findElement(By.id("form.fullname")).sendKeys(sname);
	}

	public void typefirstname(String fname) {
		driver.findElement(By.id("form.first_name")).sendKeys(fname);
	}

	public void typelastname(String lname) {
		driver.findElement(By.id("form.last_name")).sendKeys(lname);
	}

	public void typeemail(String eid) {
		driver.findElement(By.id("form.email")).sendKeys(eid);
	}

	public void typezip(String pcd) {
		driver.findElement(By.id("form.postal_code")).sendKeys(pcd);
	}

	/*public void checkbox() {
		driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[5]")).click();
	}*/

	public void clicksumbit() {
		driver.findElement(By.id("form.actions.register")).click();
	}

}
