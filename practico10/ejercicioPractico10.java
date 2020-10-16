package tests.Clase10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.GetProperties;

import java.util.List;

public class ejercicioPractico10 {

    private WebDriver driver;

    private void inicializarDriver(String url){
        GetProperties properties = new GetProperties();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Facundo\\Desktop\\Curso Selenium\\CursoSelenium\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
    }

    @Test
    public void titleTest(){
        inicializarDriver("http://www.facebook.com");
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, "Facebook - Inicia sesión o regístrate", "Los titulos no coinciden");
        driver.close();
    }

    @Test
    public void forgotAccountTest(){
        inicializarDriver("http://www.facebook.com");
        //driver.findElement(By.linkText("¿Olvidaste tu contraseña?")).click();
        WebElement olvidasteContraseña = driver.findElement(By.linkText("¿Olvidaste tu contraseña?"));
        olvidasteContraseña.click();

        String currentURL = driver.getCurrentUrl();
        String actualTitle = driver.getTitle();
        System.out.println("****** " + currentURL);

        Assert.assertEquals(actualTitle, "¿Olvidaste tu contraseña? | No puedo iniciar sesión | Facebook", "El titulo obtenido no es el esperado");
        driver.close();
    }

    @Test
    public void forgotAccountPartialLinkTest(){
        inicializarDriver("http://www.facebook.com");
        WebElement olvidasteContraseña = driver.findElement(By.partialLinkText("¿Olvidaste"));
        olvidasteContraseña.click();

        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "¿Olvidaste tu contraseña? | No puedo iniciar sesión | Facebook", "El titulo obtenido no es el esperado");
        driver.close();
    }

    @Test
    public void customSalesforceLinkTest(){
        inicializarDriver("https://login.salesforce.com/");
        //driver.findElement(By.id("mydomainLink")).click();
        driver.findElement(By.linkText("Use Custom Domain")).click();
        driver.findElement(By.name("mydomain")).sendKeys("as");
        driver.findElement(By.id("mydomainContinue")).click();
        driver.findElement(By.id("okta-signin-username")).sendKeys("test@test.com");
    }

    @Test
    public void checkBoxAndComboboxTest() throws InterruptedException {
        inicializarDriver("https://www.facebook.com");
        driver.findElement(By.id("u_0_2")).click();

        Thread.sleep(3000);
        driver.findElement(By.cssSelector("[name='sex'][value='2']")).click();

        WebElement dias = driver.findElement(By.name("birthday_day"));
        Select comboDias = new Select(dias);

        List<WebElement> comboDiasOptions = comboDias.getOptions();
        for (WebElement dia : comboDiasOptions){
            System.out.println(dia.getText());
        }

        comboDias.selectByValue("3");
    }

    @Test
    public void birthdateTest() throws InterruptedException {
        inicializarDriver("https://www.facebook.com/");

        driver.findElement(By.id("u_0_2")).click();
        Thread.sleep(2000);

        WebElement dias = driver.findElement(By.id("day"));
        Select comboDias = new Select(dias);
        comboDias.selectByValue("20");

        WebElement meses = driver.findElement(By.id("month"));
        Select comboMeses = new Select(meses);
        comboMeses.selectByValue("12");

        WebElement años = driver.findElement(By.id("year"));
        Select comboAños = new Select(años);
        comboAños.selectByValue("1990");
    }

    //Ejercicio GIT
    @Test
    public void completeRegistration() throws InterruptedException {
        inicializarDriver("https://www.facebook.com");
        driver.findElement(By.id("u_0_2")).click();

        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("John");
        driver.findElement(By.name("lastname")).sendKeys("Smith");
        driver.findElement(By.name("reg_email__")).sendKeys("5555555");
        driver.findElement(By.name("reg_passwd__")).sendKeys("123456789");

        WebElement dias = driver.findElement(By.name("birthday_day"));
        Select comboDias = new Select(dias);

        List<WebElement> comboDiasOptions = comboDias.getOptions();
        for (WebElement dia : comboDiasOptions){
            System.out.println(dia.getText());
        }
        comboDias.selectByValue("26");

        WebElement meses = driver.findElement(By.name("birthday_month"));
        Select comboMeses = new Select(meses);

        List<WebElement> comboMesesOptions = comboMeses.getOptions();
        for (WebElement mes : comboMesesOptions){
            System.out.println(mes.getText());
        }
        comboMeses.selectByValue("6");

        WebElement años = driver.findElement(By.name("birthday_year"));
        Select comboAños = new Select(años);

        List<WebElement> comboAñosOptions = comboAños.getOptions();
        for (WebElement año : comboAñosOptions){
            System.out.println(años.getText());
        }
        comboAños.selectByValue("1980");

        driver.findElement(By.cssSelector("[name='sex'][value='1']")).click();

    }

}
