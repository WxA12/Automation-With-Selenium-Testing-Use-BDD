package stepdefinisi.login;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithoutUsername {
    WebDriver login;
    @Given("open website")
    public void buka_halaman_login(){
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64/chromedriver.exe");
        login =  new ChromeDriver();
        login.get("https://www.saucedemo.com/");
    }
    @When("input password and klik button login")
    public void input_password(){
        login.findElement(By.name("password")).sendKeys("secret_sauce");
        login.findElement(By.name("login-button")).click();
    }

    @Then("erorr message username")
    public void errorr_message(){
        login.quit();
    }

}
