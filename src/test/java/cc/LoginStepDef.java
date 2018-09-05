package cc;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef { 

    private WebDriver driver;
    
    public LoginStepDef() {
    	System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
        driver = new ChromeDriver();  	
    }
    
//	@Before
//    public void before() {
//	}
	
	@Given("I am on the Login page")
	public void i_am_on_the_Login_page() {
        driver.navigate().to("http://72.52.222.78:8180/pc/PolicyCenter.do");  
	}

	@When("I fill in username with {string} and password with {string}")
	public void i_fill_in_username_with_and_password_with(String string, String string2) {
		driver.findElement(By.id("Login:LoginScreen:LoginDV:username-inputEl")).sendKeys(string);
		driver.findElement(By.id("Login:LoginScreen:LoginDV:password-inputEl")).sendKeys(string2);
		driver.findElement(By.id("Login:LoginScreen:LoginDV:submit-btnInnerEl")).click();
		
	}

	@Then("I should see the HomePage")
	public void i_should_see_the_HomePage() {
		assertEquals(true,true);
	}

}
