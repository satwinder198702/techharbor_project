package AdvanceSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class twoWindowsPractice {

    public static void main(String[] args) {

        WebDriver driver;

        WebDriverManager.firefoxdriver().setup();

        driver = new FirefoxDriver();

        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


    }


}
