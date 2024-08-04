package steps;

import common.AmazonBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import page.AmazonHomePage;

import java.util.concurrent.TimeUnit;


public class amazonLogin  extends AmazonBase {

AmazonHomePage am;
    @Given("i am on amazon Home Page")
    public void i_am_on_amazon_home_page() {

launchBrowser();
    }
    @When("i click on the sign in button from the home page")
    public void i_click_on_the_sign_in_button_from_the_home_page() {


        am = new AmazonHomePage(driver);
        am.clickingOnSignInButton();
    }
    @When("i enetr the {string} in the email input fiels")
    public void i_enetr_the_in_the_email_input_fiels(String emailId) {

        am = new AmazonHomePage(driver);
        am.enterEmail(emailId);

    }
    @When("i click on the continue button")
    public void i_click_on_the_continue_button() {
        am = new AmazonHomePage(driver);
        am.pressContinue();
    }
    @When("i eneter the {string} in the password input button")
    public void i_eneter_the_in_the_password_input_button(String password) {
        am = new AmazonHomePage(driver);
        am.enterPassword(password);
    }
    @When("i click on the sign in button")
    public void i_click_on_the_sign_in_button() {
        am = new AmazonHomePage(driver);
        am.clickingOnSignIn();

    }
    @Then("i am able to log in my acciunt successfully")
    public void i_am_able_to_log_in_my_acciunt_successfully() {
        am = new AmazonHomePage(driver);
        Assert.assertTrue(am.VerifySearchResult());
        
    }




}
