package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class invalidfield {
	WebDriver driver;

	public invalidfield(WebDriver driver)
	{
		this.driver = driver;
	}
	public void clickbutton() {
		WebElement button=driver.findElement(By.linkText("I Accept"));
	    button.click();
	}
	public void invaliddetails() throws InterruptedException {
		
	WebElement title = driver.findElement(By.id("ad_title"));
	title.sendKeys("post ad");
	Thread.sleep(5000);
	WebElement description= driver.findElement(By.id("ad_description"));
	description.sendKeys("post ad for dog");
	Thread.sleep(5000);
	driver.findElement(By.cssSelector(".post-ad-button")).click();
	Thread.sleep(5000);
}
}
