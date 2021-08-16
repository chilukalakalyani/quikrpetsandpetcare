package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class subcategory {
	WebDriver driver;
	public subcategory(WebDriver driver)
	{
		this.driver = driver;
	}
	public void clickPetCareAccessories() throws InterruptedException 
	{
		WebElement petcareaccessories = driver.findElement(By.linkText("Pet Care - Accessories"));
	    Actions action = new Actions(driver);
		action.moveToElement(petcareaccessories).build().perform();
	    petcareaccessories.click();
	    Thread.sleep(5000);
	   
	}
	public void clickbutton() {
		
		WebElement button=driver.findElement(By.linkText("I Accept"));
	    button.click();
	}
}
