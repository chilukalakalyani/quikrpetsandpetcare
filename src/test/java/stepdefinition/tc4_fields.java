package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.categorypet;
import pageobjects.fieldsform;
import pageobjects.homepage;
import pageobjects.subcategory;



public class tc4_fields {
	WebDriver driver;
	@Given("^the application is in Post Free Ad Form page$")
	public void the_application_is_in_Post_Free_Ad_Form_page() throws Throwable {
		driver = new ChromeDriver();
		   driver.get("https://quikr.com/");
	}

	@When("^the user enter details in given textfields$")
	public void the_user_enter_details_in_given_textfields() throws Throwable {
		homepage home = new homepage(driver);
		home.clickPostFreeAd();
		Thread.sleep(5000);
		categorypet pets = new categorypet(driver);
	     pets.clickOthers();
	     pets.clickPetsandPetCare();
	     Thread.sleep(5000);
	     subcategory petcare =new subcategory(driver);
         petcare.clickPetCareAccessories();
	     Thread.sleep(5000);
	     driver.findElement(By.linkText("I Accept")).click();
	   Thread.sleep(5000);
         System.out.println("selected subcategory Pet Care - Accessories");
         fieldsform Ad = new fieldsform(driver);
         Ad.clickradiobutton();
         Thread.sleep(5000);
         System.out.println(" The seleted Type of Ad is I Want to buy");
         System.out.println(" The seleted Type of Ad is freead");
        
         Ad.clicktextfields();
         Ad.clickfields();
         Thread.sleep(5000);
         System.out.println(" enter details should be displayed");
	}

	@Then("^the user enter details should be displayed$")
	public void the_user_enter_details_should_be_displayed() throws Throwable {
	    driver.quit();
	}
}
