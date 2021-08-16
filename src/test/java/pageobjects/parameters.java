package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class parameters {
	WebDriver driver;
	By email = By.id("poster-email");
    By mobilenumber=By.id("poster-mobile");
	public parameters(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void emailid(String string) {
		 driver.findElement(email).sendKeys(string);
	}
	public void mobile(String string2) {
		driver.findElement(mobilenumber).sendKeys(string2);
	}
}
