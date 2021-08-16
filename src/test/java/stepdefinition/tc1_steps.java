package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.homepage;


public class tc1_steps {
	WebDriver driver;
	@AfterStep("@launch")
	public void addScreenshot(Scenario scenario) {
	final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	scenario.attach(screenshot, "image/png", "image");
	}
	@Given("^the application in the home page$")
	public void the_application_in_the_home_page() throws Throwable {
		driver = new ChromeDriver();
		   driver.get("https://quikr.com/");
	}

	@When("^the user clicks on click on post free Ad$")
	public void the_user_clicks_on_click_on_post_free_Ad() throws Throwable {
		homepage home = new homepage(driver);
		home.clickPostFreeAd();
		Thread.sleep(5000);
	}

	@Then("^the user reaches the Post Free Ad page$")
	public void the_user_reaches_the_Post_Free_Ad_page() throws Throwable {
	}@After("@launch")
		public void exitBrowser() throws InterruptedException {
		driver.quit();
	}
	    
	}

