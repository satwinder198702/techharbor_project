package AdvanceSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class drpDownPractice {

    public static void main(String[] args){

        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdown']"));

        Select s = new Select(dropDown);


        s.selectByIndex(1);


        s.selectByValue("2");

        s.selectByVisibleText("Option 1");

        List<WebElement> allOptions = s.getOptions();

        for (int i = 0; i < allOptions.size(); i++){

           String text = allOptions.get(i).getText();

           System.out.println(text);
        }



  }


}
