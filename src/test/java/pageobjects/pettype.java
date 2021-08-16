package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pettype {
	WebDriver driver;

	public pettype(WebDriver driver)
	{
		this.driver = driver;
	}
	public void dropdown() throws InterruptedException {
	WebElement dropdown1= driver.findElement(By.linkText("Pet Type *"));
	dropdown1.click();
	Thread.sleep(2000);
	WebElement dropdown2 =driver.findElement(By.linkText("Dog"));
	dropdown2.click();
	WebElement dropdown3 =driver.findElement(By.linkText("Cat"));
	dropdown3.click();
	Thread.sleep(5000);
	driver.findElement(By.cssSelector(".post-ad-button")).click();
	Thread.sleep(5000);
}
}
