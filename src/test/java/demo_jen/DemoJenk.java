package demo_jen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DemoJenk {
	
	WebDriver driver;
	@Given("TestMeApp is up and runningg")
	public void testmeapp_is_up_and_runningg() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_h2a.06.15\\Desktop\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe\\");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}

	@Then("registered user enter the valid credens")
	public void registered_user_enter_the_valid_credens() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
		driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		driver.findElement(By .name("userName")).sendKeys("Christ");
		driver.findElement(By .name("password")).sendKeys("Christ123");
		driver.findElement(By .name("Login")).click();
	}

	@Then("verifies for the login status for his creden")
	public void verifies_for_the_login_status_for_his_creden() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		String act = driver.findElement(By .linkText("SignOut")).getText();
		String exp = "SignOut";
		Assert.assertEquals(act, exp);
	}
	
}