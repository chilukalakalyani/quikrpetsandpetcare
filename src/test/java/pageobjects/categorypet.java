package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class categorypet {
	WebDriver driver;
	public categorypet(WebDriver driver)
	{
		this.driver = driver;
	}
	public void clickOthers()
	{
		
		WebElement linkOthers = driver.findElement(By.xpath("//*[@id=\"papcontainer\"]/div[1]/div[8]/div[2]"));
		  linkOthers.click();
	}
	public void clickPetsandPetCare()
	{
		WebElement linkPetsandPetCare = driver.findElement(By.xpath("//*[@id=\"papcontainer\"]/div[1]/div[10]"));
		  linkPetsandPetCare.click();
	}
}
