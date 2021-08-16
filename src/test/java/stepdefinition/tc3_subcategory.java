package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.categorypet;
import pageobjects.homepage;
import pageobjects.subcategory;



public class tc3_subcategory {
	WebDriver driver;
	@Given("^the application in subcategory page$")
	public void the_application_in_subcategory_page() throws Throwable {
		driver = new ChromeDriver();
		   driver.get("https://quikr.com/");
	}
	@When("^the user clicks on click on PetCare-Accessories$")
	public void the_user_clicks_on_click_on_PetCare_Accessories() throws Throwable {
		homepage home = new homepage(driver);
		home.clickPostFreeAd();
		Thread.sleep(5000);
		categorypet pets = new categorypet(driver);
	     pets.clickOthers();
	     pets.clickPetsandPetCare();
	     Thread.sleep(5000);
	     subcategory petcare =new  subcategory(driver);
         petcare.clickPetCareAccessories();
	     Thread.sleep(5000);
	     //driver.findElement(By.cssSelector(".menu-item-selected > .menu-item-text")).click();
	     //driver.findElement(By.linkText("Pet Care - Accessories")).click();
	     petcare.clickbutton();
	   Thread.sleep(5000);
         System.out.println("Pet Care - Accessories");
	}

	@Then("^the user gets Post Free Ad form$")
	public void the_user_gets_Post_Free_Ad_form() throws Throwable {
	   driver.quit();
	}
}
