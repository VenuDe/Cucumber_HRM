package Definations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Test_Defination {
	
	WebDriver driver;
	public static String URL = "https://opensource-demo.orangehrmlive.com/";
	
		
		@Given("I should be in the Login page of OrangeHRM")
		public void i_should_be_in_the_login_page_of_orange_hrm() {
		    WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		    driver.get(URL);
		}
		
		@When("Enter Username {string}")
		public void enter_username(String string) {
			driver.findElement(By.id("txtUsername")).sendKeys(string);	  
		}
		
		@When("Enter Password {string}")
		public void enter_password(String string) {
			driver.findElement(By.id("txtPassword")).sendKeys(string);	  
		}
		
		
		@When("Click on LoginButton")
		public void click_on_login_button() {
			driver.findElement(By.id("btnLogin")).click();
		   
		}
		
		@Then("Login Successfull message")
		public void login_successfull_message() {
			Assert.assertEquals(driver.getTitle(), "OrangeHRM");
			driver.getCurrentUrl();
			driver.getTitle();
		}
		
		@Then("close")
		public void close() {
			driver.close();
		  
		}

}
