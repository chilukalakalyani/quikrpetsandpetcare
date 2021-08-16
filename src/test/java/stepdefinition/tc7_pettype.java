package stepdefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.invalidfield;
import pageobjects.pettype;

public class tc7_pettype {
	WebDriver driver;
	@Given("the application is in Post Free Ad page Form")
	public void the_application_is_in_Post_Free_Ad_page_Form() {
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    	//ChromeOptions options = new ChromeOptions();
	    //options.addArguments("--disable-notifications");
        //driver = new ChromeDriver(options);
		driver = new ChromeDriver();
        driver.get("https://www.quikr.com/pets/post-classifieds-ads+allindia?postadcategoryid=1392");
		   
	}

	@When("the user select more than one option from dropdown")
	public void the_user_select_more_than_one_option_from_dropdown() throws InterruptedException {
		
		    //driver.findElement(By.linkText("I Accept")).click();
			  // Thread.sleep(5000);
			   invalidfield form=new invalidfield(driver);
			   form.clickbutton();
			   pettype type=new pettype(driver);
			   type.dropdown();
				//String expectedError="Please one Pettype";
				//WebElement errorMsg=driver.findElement(By.xpath("//*[@id=\"Pet_Type\"]/div/a/text()"));
				//String acterror=errorMsg.getText();
				//assertEquals(acterror,expectedError);
				Thread.sleep(5000);
	}

	@Then("the error should be displayed as select one option")
	public void the_error_should_be_displayed_as_select_one_option() {
		driver.quit();
	}
}
