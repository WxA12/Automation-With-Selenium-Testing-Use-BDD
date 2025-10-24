package stepdefinisi.login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginValid {
    WebDriver admin;

    @Given("halaman login")
    public void buka_halaman_login(){
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64/chromedriver.exe");
        admin = new ChromeDriver();
        admin.get("https://www.saucedemo.com/");
    }
    @When("input username dan password valid")
    public void input_username_password_valid(){

        admin.findElement(By.name("user-name")).sendKeys("standard_user");
        admin.findElement(By.name("password")).sendKeys("secret_sauce");
        admin.findElement(By.name("login-button")).click();

    }

    @Then("user di arahkan ke halaman dashboard")
    public void redirect_dashboard() {
        admin.quit();

    }



}
