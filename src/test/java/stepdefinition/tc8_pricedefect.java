package stepdefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.defectprice;
import pageobjects.fieldsform;
import pageobjects.invalidfield;

public class tc8_pricedefect {
	WebDriver driver;
	
	@Given("the application is in Post Free Ad Form PAGE")
	public void the_application_is_in_Post_Free_Ad_Form_PAGE() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    	ChromeOptions options = new ChromeOptions();
	    options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
		//driver = new ChromeDriver();
		   driver.get("https://www.quikr.com/pets/post-classifieds-ads+allindia?postadcategoryid=1392");
	}

	@When("the user enter price in textfield which is beyond limit")
	public void the_user_enter_price_in_textfield_which_is_beyond_limit() throws InterruptedException {
		 //driver.findElement(By.linkText("I Accept")).click();
		   //Thread.sleep(5000);
		   invalidfield form=new invalidfield(driver);
		   form.clickbutton();
		fieldsform Ad = new fieldsform(driver);
        Ad.clickradiobutton();
        Ad.clicktextfields();
        Ad.clickfields();
        Thread.sleep(5000);
        defectprice form1=new defectprice(driver);
        form1.pricefield();
        String expectedError="Please enter price with in limit";
		WebElement errorMsg=driver.findElement(By.xpath("//*[@id=\"Price\"]/div/label/span[2]"));
		String acterror=errorMsg.getText();
		assertEquals(acterror,expectedError);
	}

	@Then("the user should get error msg")
	public void the_user_should_get_error_msg() {
	   driver.quit();
	}
}
