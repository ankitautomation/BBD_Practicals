package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class TestCaseSteps {
	
WebDriver driver;

@Given("^Setup the System Properties for Browser$")
public void setup_the_System_Properties_for_Browser()   {
	
	System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   
}

@Given("^Launch the base url$")
public void Launch_the_base_url()
{
	
	driver.get("https://www.phptravels.net/admin");
	
}

@Given("^User is on login Page$")
public void user_is_on_login_Page() {
	
	String expected_title = "Administator Login";
	String actual_title = driver.getTitle().toString();
	Assert.assertEquals(expected_title, actual_title);
    
}

@Then("^User Enter the username And User enter the password$")
public void user_Enter_the_username_And_User_enter_the_password()  {
	
	driver.findElement(By.xpath("//input[@name='email' and @type='text']")).sendKeys("admin@phptravels.com");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demoadmin");	
	
  
}

@Then("^User Click on Login Button$")
public void user_Click_on_Login_Button() throws InterruptedException   {
	
	driver.findElement(By.xpath("//span[contains(text(),'Login')] ")).click();
	Thread.sleep(3000);
  
}

@Then("^User Verify the Dashboard Page$")
public void user_Verify_the_Dashboard_Page()   {
	
	String expected_title = "Dashboard";
	String actual_title = driver.getTitle().toString();
	Assert.assertEquals(expected_title, actual_title);
     
}

@Then("^Close the browser$")
public void close_the_browser()   {
	
	driver.quit();
   
}


}
