package stepdefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.invalidfield;
import pageobjects.parameters;


public class tc6_invalidemail {
	WebDriver driver;
	  @Test
	  @Given("the application is in Post Free Ad Form Page")
	  public void the_application_is_in_Post_Free_Ad_Form_Page() {
		  //System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  	//ChromeOptions options = new ChromeOptions();
			    //options.addArguments("--disable-notifications");
		      //driver = new ChromeDriver(options);
				driver = new ChromeDriver();
				driver.get("https://www.quikr.com/pets/post-classifieds-ads+allindia?postadcategoryid=1392");
	  }

	  @When("the user enter {string},{string}")
	  public void the_user_enter(String string, String string2) throws InterruptedException {
		  
		  driver.findElement(By.linkText("I Accept")).click();
		   Thread.sleep(5000);
		   invalidfield form=new invalidfield(driver);
		   form.clickbutton();
		  parameters fields=new parameters(driver);
	      fields.emailid(string);
	      Thread.sleep(5000);
	      fields.mobile(string2);
	      Thread.sleep(5000);
	      driver.findElement(By.cssSelector(".post-ad-button")).click();
			Thread.sleep(5000);
	      String expectedError="Wrong Input. Please enter valid form data.";
			//WebElement errorMsg=driver.findElement(By.xpath("/html/body/div[6]/div/div[4]/div[5]/div[2]/div/div/label/span[2]"));
	      WebElement errorMsg=driver.findElement(By.xpath("/html/body/div[6]/div/div[2]"));
			String acterror=errorMsg.getText();
			assertEquals(acterror,expectedError);
			Thread.sleep(5000);
	  }

	  @Then("the error should be displayed as invalid email and mobile number")
	  public void the_error_should_be_displayed_as_invalid_email_and_mobile_number() {
		  driver.quit();
	  }
}
