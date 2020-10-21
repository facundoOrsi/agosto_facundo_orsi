package tests.Clase11;

import com.sun.xml.internal.ws.server.DefaultResourceInjector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.GetProperties;

public class spotify_test {

    private static String SPOTIFY_URL = "https://www.spotify.com/uy/signup/";
    private WebDriver driver;

    private void inicializarDriver(String url){
        GetProperties properties = new GetProperties();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Facundo\\Desktop\\Curso Selenium\\CursoSelenium\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
    }

    @Test
    public void spotifyByNameTest()  {
        inicializarDriver(SPOTIFY_URL);

        driver.findElement(By.xpath("//*[@name='email']")).sendKeys("testing@test.com");
        driver.findElement(By.xpath("//*[@name='confirm']")).sendKeys("testing@test.com");
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("test123");
        driver.findElement(By.xpath("//*[@name='displayname']")).sendKeys("Automation");
        driver.findElement(By.xpath("//*[@name='day']")).sendKeys("13");

        WebElement dias = driver.findElement(By.xpath("//*[@name='month']"));
        Select comboDias = new Select(dias);
        comboDias.selectByValue("04");

        driver.findElement(By.xpath("//*[@name='year']")).sendKeys("1988");
     }

    @Test
    public void spotifyByPlaceHolder(){
        inicializarDriver(SPOTIFY_URL);

        driver.findElement(By.xpath("//*[@placeholder='Introduce tu correo electrónico.']")).sendKeys("testing@test.com");
        driver.findElement(By.xpath("//*[@placeholder='Vuelve a introducir tu correo electrónico.']")).sendKeys("testing@test.com");
        driver.findElement(By.xpath("//*[@placeholder='Crea una contraseña.']")).sendKeys("1234");
        driver.findElement(By.xpath("//*[@placeholder='Introduce un nombre de perfil.']")).sendKeys("Automation");
        driver.findElement(By.xpath("//*[@placeholder='DD']")).sendKeys("13");
        driver.findElement(By.xpath("//*[@placeholder='AAAA']")).sendKeys("1988");

        /*WebElement errorEmail = driver.findElement(By.xpath("//span[contains(text(), 'Este correo electrónico ya está conectado a una cuenta.')]"));
       Assert.assertEquals(errorEmail.getText(),"Este correo electrónico ya está conectado a una cuenta. Inicia sesión." );*/
    }

    @Test
    public void spotifyByName(){
        inicializarDriver(SPOTIFY_URL);

        driver.findElement(By.cssSelector("#email")).sendKeys("test@test.com");
        driver.findElement(By.cssSelector("#confirm")).sendKeys("test@test.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("1234");
        driver.findElement(By.cssSelector("#displayname")).sendKeys("Automation");
        driver.findElement(By.cssSelector("#day")).sendKeys("13");

        WebElement dias = driver.findElement(By.cssSelector("#month"));
        Select comboDias = new Select(dias);
        comboDias.selectByValue("04");

        driver.findElement(By.cssSelector("#year")).sendKeys("1988");
        driver.findElement(By.cssSelector("#__next > main > div.signuppage__Signup-sof6g5-0.cnXhNZ > form > div:nth-child(7) > div.GenderSelect__FlexRow-v1a8zn-0.eHAjfo > label:nth-child(1) > span.Type__TypeElement-sc-9snywk-0.gLJgbv.Label-sc-192ocay-0.ghQPOC")).click();
    }

    /* Ejercicio GIT */
    @Test
    public void spotifyByPlaceHolderGIT(){
        inicializarDriver(SPOTIFY_URL);

        driver.findElement(By.cssSelector("[placeholder='Introduce tu correo electrónico.']")).sendKeys("test@test.com");
        driver.findElement(By.cssSelector("[placeholder='Vuelve a introducir tu correo electrónico.']")).sendKeys("test@test.com");
        driver.findElement(By.cssSelector("[placeholder='Crea una contraseña.']")).sendKeys("123");
        driver.findElement(By.cssSelector("[placeholder='Introduce un nombre de perfil.']")).sendKeys("Automation");
        driver.findElement(By.cssSelector("[placeholder='DD']")).sendKeys("13");

        WebElement dias = driver.findElement(By.cssSelector("#month"));
        Select comboDias = new Select(dias);
        comboDias.selectByValue("04");

        driver.findElement(By.cssSelector("[placeholder='AAAA']")).sendKeys("1988");
    }
}
