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

public class tc5_invalid {
WebDriver driver;
	
	@Given("the application is in Post Free Ad Form")
	public void the_application_is_in_Post_Free_Ad_Form() {
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    	//ChromeOptions options = new ChromeOptions();
	    //options.addArguments("--disable-notifications");
       // driver = new ChromeDriver(options);
		driver = new ChromeDriver();
		   driver.get("https://www.quikr.com/pets/post-classifieds-ads+allindia?postadcategoryid=1392");
		   //driver.get("https://www.quikr.com/hyderabad");
	}

	@When("the user enter lessthan four words in given title textfield")
	public void the_user_enter_lessthan_four_words_in_given_title_textfield() throws InterruptedException {
		WebElement button=driver.findElement(By.linkText("I Accept"));
	    button.click();
			   invalidfield form=new invalidfield(driver);
			   form.clickbutton();
			   form.invaliddetails();
				String expectedError="Title should be minimum 4 words.";
				WebElement errorMsg=driver.findElement(By.xpath("/html/body/div[6]/div/div[4]/div[2]/div[2]/div/div[1]/label/span[2]"));
				String acterror=errorMsg.getText();
				assertEquals(acterror,expectedError);
				System.out.println("Tittle should be minimum 4 words");
				Thread.sleep(5000);
				String expectError="Description should be minimum 8 words.";
				WebElement error=driver.findElement(By.xpath("/html/body/div[6]/div/div[4]/div[2]/div[3]/div/div[1]/label/span[2]"));
				String actualerror=error.getText();
				assertEquals(actualerror,expectError);
				System.out.println("Description should be minimum 8 words");
				Thread.sleep(5000);
				
	

	}

	@Then("the error should be displayed")
	public void the_error_should_be_displayed() {
	    driver.quit();
	}
}
