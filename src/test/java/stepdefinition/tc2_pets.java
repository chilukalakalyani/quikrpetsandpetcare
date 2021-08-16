package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.categorypet;
import pageobjects.homepage;



public class tc2_pets {
	WebDriver driver;
	@Given("^the application in Post Free Ad page$")
	public void the_application_in_Post_Free_Ad_page() throws Throwable {
		driver = new ChromeDriver();
		   driver.get("https://quikr.com/");
	}
	@When("^the user clicks on click on Pets & PetCare$")
	public void the_user_clicks_on_click_on_Pets_PetCare() throws Throwable {
		homepage home = new homepage(driver);
		home.clickPostFreeAd();
		Thread.sleep(5000);
		categorypet pets = new categorypet(driver);
	     pets.clickOthers();
	     pets.clickPetsandPetCare();
System.out.println("the seleted category is Pets&PetCare");
Thread.sleep(5000);
	    }

	@Then("^the user gets Subcategory list$")
	public void the_user_gets_Subcategory_list() throws Throwable {

		driver.quit();
		
	}
}
