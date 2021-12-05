package stepdefinitions;

import gherkin.formatter.model.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    // Creating WebDriver field and making it a private method so you can't change the field but calling
    // static so you can use it outside of the class.
    private static WebDriver driver;

    public static WebDriver driver(){
        return driver;
    }

    @Before
    public void beforeScenario(Scenario scenario){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void afterScenario(Scenario scenario){
        driver.quit();
    }





}
