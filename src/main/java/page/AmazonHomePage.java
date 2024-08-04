package page;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {
WebDriver driver;
    public AmazonHomePage(WebDriver dr) {
        driver = dr;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "nav-link-accountList-nav-line-1")
    WebElement signInButton;
    @FindBy(id = "ap_email")
    WebElement inputField;

    @FindBy(id =  "continue")
    WebElement pressButton;

    @FindBy(id =  "ap_password")
    WebElement passwordField;

    @FindBy(id =  "signInSubmit")
    WebElement signIn;

    @FindBy(id= "nav-hamburger-menu")
    WebElement searchResult;


    public void clickingOnSignInButton() {
signInButton.click();

    }
    public void enterEmail(String emailId){
        inputField.sendKeys(emailId);}


    public void pressContinue(){
        pressButton.click();


    }
    public void enterPassword(String password){
        passwordField.sendKeys(password);


    }
    public void clickingOnSignIn() {
        signIn.click();

    }

    public boolean VerifySearchResult(){

        return searchResult.isDisplayed();
    }

}
