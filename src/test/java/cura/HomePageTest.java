package cura;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest {

    WebDriver driver;

    @BeforeTest
    private void init(){
//        inisialisasi browser
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
//        go to Homepage
        driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
    }

    @Test
    private void chekelement() {
//        chek h1 element
        Assert.assertEquals(driver.findElement(By.cssSelector("header h1")).getText(),"CURA Healthcare Service");
        Assert.assertEquals(Color.fromString(driver.findElement(By.cssSelector("header h1")).getCssValue("color")).asHex(),"#ffffff");

//      chek h3 element
        Assert.assertEquals(driver.findElement(By.cssSelector("header h3")).getText(),"We Care About Your Health");
        Assert.assertEquals(Color.fromString(driver.findElement(By.cssSelector("header h3")).getCssValue("color")).asHex(),"#4fb6e7");

//      Chek button
        Assert.assertEquals(driver.findElement(By.id("btn-make-appointment")).getText(),"Make Appointment");
        Assert.assertEquals(driver.findElement(By.id("btn-make-appointment")).getCssValue("background-color"),"rgba(115, 112, 181, 0.8)");

//      Chek button togle
       Assert.assertEquals(driver.findElement(By.id("menu-toggle")).getCssValue("background-color"),"rgba(115, 112, 181, 0.9)");
}

    @Test
    private void buttontogglechek(){
        driver.findElement(By.id("menu-toggle")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"sidebar-wrapper\"]/ul/li[1]")).getText(),"CURA Healthcare");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"sidebar-wrapper\"]/ul/li[2]")).getText(),"Home");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"sidebar-wrapper\"]/ul/li[3]")).getText(),"Login");
        driver.findElement(By.id("menu-toggle")).click();
    }



    @AfterTest
    private void duit(){
        driver.quit();
    }


}
