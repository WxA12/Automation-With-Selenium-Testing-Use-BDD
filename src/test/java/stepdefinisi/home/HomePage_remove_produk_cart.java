package stepdefinisi.home;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage_remove_produk_cart {
    WebDriver remove;

    @Given("open website remove produk cart")
    public void open_website(){

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64/chromedriver.exe");
        remove = new ChromeDriver();
        remove.get("https://www.saucedemo.com/");
    }
    @When("input password and password valid remove cart")
    public void input_username_and_password_valid() throws InterruptedException{

        remove.findElement(By.name("user-name")).sendKeys("standard_user");
        remove.findElement(By.name("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
    }
    @And("klik button login remove cart")
    public void klik_button_login(){
        remove.findElement(By.name("login-button")).click();
    }
    @And("add a cart remove")
    public void klik_add_to_cart(){
        remove.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }
    @And("klik a cart remove")
    public void klik_cart(){
        remove.findElement(By.id("shopping_cart_container")).click();
    }
    @And("klik remove produk")
    public void klik_remove_cart(){
        remove.findElement(By.id("remove-sauce-labs-backpack")).click();
    }

    @Then("product succes remove")
    public void see_detail_product() throws InterruptedException{
        Thread.sleep(2000);
        remove.quit();
    }
}
