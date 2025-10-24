package coba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class HomePageTest {
    WebDriver lemon;

    @BeforeTest
    private void init(){
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64/chromedriver.exe");
        lemon = new ChromeDriver();
//        Go to URl
        lemon.navigate().to("https://meterai-elektronik.com/");
        lemon.manage().window().maximize();
    }

    @Test
    private void chekElement(){
//        WebElement header =  lemon.findElement(By.cssSelector("h1.mb-3"));
//        String ActualText = header.getText();
//
//        String Expected = "Selamat Datang di\n Meterai-Elektronik.com";
//
//        Assert.assertEquals("Selamat Datang di\n Meterai-Elektronik.com",Expected,ActualText);

//  Chek element h1
    Assert.assertEquals(lemon.findElement(By.cssSelector("h1.mb-3")).getText(),"Selamat Datang di\nMeterai-Elektronik.com");
//  Chek element p
    Assert.assertEquals(lemon.findElement(By.cssSelector("p.mb-3")).getText(),"Pembelian meterai elektronik kini lebih mudah dan aman khususnya bagi pendaftar CASN melalui situs resmi dan terpercaya.");

        

    }
    @Test
    private void buttonlogin(){
        WebElement button =  lemon.findElement(By.id("btnCheck"));
        String ActualText = button.getText().trim();

        String expectedtext = "Login";

        Assert.assertEquals(ActualText,expectedtext);

        lemon.findElement(By.id("btnCheck")).click();
        lemon.get("https://www.meterai-elektronik.com/login");
//        Assert.assertEquals(lemon.findElement(By.xpath("//*[@id=\"btnCheck\"]/text()")).getText()," Login");
//        lemon.findElement(By.id("btnCheck")).click();

    }
    @Test
    private void logintest(){
        lemon.get("https://www.meterai-elektronik.com/login");
        lemon.findElement(By.id("username")).sendKeys("Percobaan");
        lemon.findElement(By.id("password")).sendKeys("test");
        String s = lemon.findElement(By.id("username")).getAttribute("value");
        String p = lemon.findElement(By.id("password")).getAttribute("value");

        System.out.println(s);
        System.out.println(p);

    }



    @AfterTest
    private void keluar(){
        lemon.quit();
    }
}
