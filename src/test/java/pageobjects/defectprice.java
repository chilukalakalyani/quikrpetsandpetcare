package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class defectprice {
	WebDriver driver;

	public defectprice(WebDriver driver)
	{
		this.driver = driver;
	}
	public void pricefield() throws InterruptedException {
		WebElement price = driver.findElement(By.cssSelector(".custom-form-controls > #Price"));
		price.sendKeys("984675747845848782892839893455689834347383743647675753767283784783743876586566");
		Thread.sleep(5000);
		//driver.findElement(By.cssSelector(".post-ad-button")).click();
		//Thread.sleep(5000);
	}
	
}
