import org.testng.annotations.Test;


	import org.testng.annotations.DataProvider;
	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;



	@CucumberOptions(monochrome=true, features="src/test/resources/features",glue= {"stepdefinition"},
	plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
	tags="")
	public class testrunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel=false)
	public Object[][]scenarios(){
	return super.scenarios();
	}
	}


  

