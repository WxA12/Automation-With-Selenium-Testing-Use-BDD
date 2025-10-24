package stepdefinisi.login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithoutPassword {
    WebDriver admin;

    @Given("buka halaman login")
    public void buka_halaman_login(){
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64/chromedriver.exe");
        admin = new ChromeDriver();
        admin.get("https://www.saucedemo.com/");
    }
    @When("input username valid and klik button login")
    public void input_username_valid() {

        admin.findElement(By.name("user-name")).sendKeys("standard_user");
        admin.findElement(By.name("login-button")).click();
    }


    @Then("erorr message")
    public void erorr_message() {

        admin.quit();
    }
}