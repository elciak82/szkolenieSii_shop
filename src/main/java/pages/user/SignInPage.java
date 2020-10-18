package pages.user;

import models.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SignInPage extends BasePage {
    public SignInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#form-control [name = 'email']")
    private WebElement emailInput;

    @FindBy (css = "[name = 'password']")
    private WebElement passwordInput;

    @FindBy (css = "#submit-login")
    private WebElement loginButton;

    @FindBy (css = ".no-account a")
    private WebElement registerNewUserButton;

    public void loginUser (User user) {
        emailInput.sendKeys(user.getEmail());
        passwordInput.sendKeys(user.getPassword());
        loginButton.click();
    }

    public RegistrationPage registerNewUser(){
        registerNewUserButton.click();
        return new RegistrationPage(getDriver());
    }




}
