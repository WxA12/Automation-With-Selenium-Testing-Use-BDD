package stepdefinisi.login;

import java.time.Duration;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginInvalid {

    WebDriver invalid;

    @Given("Open Website Invalid")
    public void open_website_invalid(){
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64/chromedriver.exe");
        invalid = new ChromeDriver();
        invalid.get("https://www.saucedemo.com/");

    }
    @When("Klik button login Invalid")
    public void Klik_button_login_Invalid(){
        invalid.findElement(By.name("login-button")).click();
    }
    @Then("Error message Invalid")
    public void erorr_message_invalid(){
        invalid.manage().timeouts().implicitlyWait(Duration.ofMillis(200));
        invalid.quit();
    }
}
