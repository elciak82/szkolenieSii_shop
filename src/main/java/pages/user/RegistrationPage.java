package pages.user;

import models.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class RegistrationPage extends BasePage {
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#id_gender")
    private List<WebElement> genderRadioButtons;

    @FindBy(css = ".custom-radio [value = '2']")
    private WebElement genderMrs;

    @FindBy (css = "[name = 'firstname']")
    private WebElement firstNameInput;

    @FindBy (css = "[name = 'lastname']")
    private WebElement lastNameInput;

    @FindBy (css = "#register-form [name = 'email']")
    private WebElement emailInput;

    @FindBy (css = "[name = 'password']")
    private WebElement passwordInput;

    @FindBy (css = "[name = 'birthday']")
    private WebElement birthdayInput;

    @FindBy (css = "[name = 'optin']")
    private WebElement offersCheckbox;

    @FindBy (css = "[name = 'newsletter']")
    private WebElement newsletterCheckbox;

    @FindBy (css = ".form-control-submit")
    private WebElement registerUserButton;

    public void registerUser (User user) {
        firstNameInput.sendKeys(user.getFirstName());
        lastNameInput.sendKeys(user.getLastName());
        emailInput.sendKeys(user.getEmail());
        passwordInput.sendKeys(user.getPassword());

        for(WebElement genderElement : genderRadioButtons){
            if(Integer.parseInt(genderElement.getAttribute("value")) == user.getGender()){
                genderElement.click();
            }
        }

    }
}
