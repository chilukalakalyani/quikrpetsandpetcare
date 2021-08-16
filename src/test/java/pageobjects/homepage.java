package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage {
	WebDriver driver;
	
	public homepage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void clickPostFreeAd()
	{
		driver.findElement(By.id("postAdBtn")).click();
	     
	}
}
