package stepdefinisi.home;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HomePage_add_cart {
    WebDriver add;

    @Given("open website add")
    public void open_website(){
        Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64/chromedriver.exe");
        add = new ChromeDriver();
        add.get("https://www.saucedemo.com/");
    }
    @When("input username and password valid add")
    public void input_login(){

        add.findElement(By.name("user-name")).sendKeys("standard_user");
        add.findElement(By.name("password")).sendKeys("secret_sauce");
    }
    @And("klik button login add")
    public void klik_button(){
        add.findElement(By.name("login-button")).click();
    }
    @And("add a cart")
    public void add_cart(){
        add.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }
    @And("klik a cart")
    public void klik_cart(){
        add.findElement(By.id("shopping_cart_container")).click();
    }
    @Then("See the cart contents")
    public void view_all_cart(){
        add.quit();
    }
}
