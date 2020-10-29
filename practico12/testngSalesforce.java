package tests.Clase12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Driver;

public class testngSalesforce {

    private WebDriver driver;
    private final String SALESFORCE_URL = "https://login.salesforce.com/";

    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Facundo\\Desktop\\Curso Selenium\\CursoSelenium\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(SALESFORCE_URL);
    }

    @Test (priority = 1)
    public void validateSalesforceLogoTest(){
       WebElement e = driver.findElement(By.id("logo"));
       System.out.println(e.getTagName());
       System.out.println(e.getAttribute("alt"));
    }

    @Test (enabled = false)
    public void RememberMeIsSelected(){
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected());
    }

    @Test (priority = 2)
    public void FooterIsValid(){
        WebElement e = driver.findElement(By.id("footer"));
        Assert.assertTrue(e.getText().contains("All rights reserved"));
    }

    /* Ejercicio GIT */
    @Test
    public void LoginFailureTest(){
        WebElement logo = driver.findElement(By.id("logo"));
        Assert.assertTrue(logo.isDisplayed());
        driver.findElement(By.id("username")).sendKeys("test@test.com");
        driver.findElement(By.id("password")).sendKeys("123466");
        driver.findElement(By.id("Login")).click();

        WebElement e = driver.findElement(By.id("error"));
        System.out.println(e.getText());

    }

    @AfterMethod
    public void close(){
        //driver.close();
    }
}
