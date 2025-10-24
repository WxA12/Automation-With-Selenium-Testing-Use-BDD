package stepdefinisi.home;
import java.util.logging.Level;
import java.util.logging.Logger;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage_detail_produk {
    WebDriver detail;

    @Given("open website detail")
    public void open_website(){

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64/chromedriver.exe");
        detail = new ChromeDriver();
        detail.get("https://www.saucedemo.com/");
    }
    @When("input username and password valid detail")
    public void input_username_and_password_valid() throws InterruptedException{

        detail.findElement(By.name("user-name")).sendKeys("standard_user");
        detail.findElement(By.name("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
    }
    @And("klik button login detail")
    public void klik_button_login(){
        detail.findElement(By.name("login-button")).click();
    }
    @And("klik name product")
    public void klik_name_product(){
        detail.findElement(By.id("item_4_title_link")).click();
    }
    @Then("see detail product")
    public void see_detail_product(){
        detail.quit();
    }
}

