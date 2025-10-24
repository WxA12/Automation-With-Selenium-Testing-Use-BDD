package Seleniumdev;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pertama {
    WebDriver pertama;

    @Given("open web")
    public void open(){
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64/chromedriver.exe");
        pertama =  new ChromeDriver();
        pertama.get("https://www.selenium.dev/selenium/web/web-form.html");
    }

}
