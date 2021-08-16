package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class fieldsform {
	WebDriver driver;

	public fieldsform(WebDriver driver)
	{
		this.driver = driver;
	}
	public void clickradiobutton() throws InterruptedException
	{
	//List<WebElement> TypeofAd = driver.findElements(By.name("ad-type"));
     //TypeofAd.get(0).click();
     //Thread.sleep(5000);
    //TypeofAd.get(1).click();
		//driver.findElements(By.xpath("//*[@id=\"ad-type\"]/div"));
     //Thread.sleep(5000);
		WebElement radio1= driver.findElement(By.id("seller"));
		WebElement radio2= driver.findElement(By.id("buyer"));
	    radio1.click();
	    Thread.sleep(5000);
		 //radio2.click();
	   WebElement select1=driver.findElement(By.id("freead"));
	   WebElement select2=driver.findElement(By.id("premiumad"));
	   WebElement select3=driver.findElement(By.id("goldad"));
	   select1.click();
	   //select2.click();
	  //select3.click();
	   Thread.sleep(5000);
	}
	public void clicktextfields() throws InterruptedException{
		WebElement title = driver.findElement(By.id("ad_title"));
		title.sendKeys("post ad for selling dog");
		Thread.sleep(5000);
		WebElement description = driver.findElement(By.id("ad_description"));
		description.sendKeys("post ad for selling dog which is available ");
		Thread.sleep(5000);
		WebElement email = driver.findElement(By.id("poster-email"));
		email.sendKeys("chilukalakalyani@gmail.com");
		Thread.sleep(5000);
		WebElement mobile = driver.findElement(By.id("poster-mobile"));
		mobile.sendKeys("9515740047");
		Thread.sleep(5000);
	}
	public void clickfields() throws InterruptedException{
		//WebElement dropdown= driver.findElement(By.xpath("//*[@id=\"Pet_Type\"]/div"));
		//dropdown.selectByIndex(2);
		//dropdown.selectByVisibleText("Dog");
		//Select dropdown = new Select(driver.findElement(By.linkText("Pet Type*")));
        //int total;
        //total = dropdown.getOptions().size();
        //int i;
        //for(i=0;i<total;i++)
        //for(i=1;i<total-1;i++)
        //WebElement testdropdown=driver.findElement(By.linkText("Pet Type *"));
           //System.out.println("Iteration # " + i);
        //Select dropdown=new Select(testdropdown);
            //dropdown.selectByIndex(2);
		WebElement dropdown1= driver.findElement(By.linkText("Pet Type *"));
		dropdown1.click();
		Thread.sleep(2000);
		WebElement dropdown2 =driver.findElement(By.linkText("Dog"));
		dropdown2.click();
		Thread.sleep(2000);
		WebElement dropdown3 =driver.findElement(By.cssSelector(".postad-section:nth-child(4) > h3"));
	    dropdown3.click();
	    Thread.sleep(2000);
	    WebElement dropdown4 =driver.findElement(By.id("1"));
	    dropdown4.click();
	    Thread.sleep(2000);
	    WebElement dropdown5 =driver.findElement(By.linkText("Bangalore"));
	    dropdown5.click();
	    Thread.sleep(2000);
	    WebElement dropdown6 =driver.findElement(By.linkText("Your Locality*"));
	    dropdown6.click();
	    Thread.sleep(2000);
	    WebElement dropdown7= driver.findElement(By.linkText("100 Feet Road"));
	    dropdown7.click();
	    Thread.sleep(2000);
	    WebElement dropdown8 =driver.findElement(By.cssSelector(".postad-section:nth-child(4) > .form-row"));
	    dropdown8.click();
	    Thread.sleep(2000);
	}
}
