package pages.commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.basket.BasketPage;
import pages.user.SignInPage;

public class MenuPage extends BasePage {
    public MenuPage(WebDriver driver){
        super(driver); //bo dziedziczymy z Base wiec musi być botam jest konstruktor

    }

    @FindBy (css = ".ui-autocomplete-input")
    private WebElement searchInput;

    @FindBy (css = ".cart-products-count")
    private WebElement basketQuantity;

    @FindBy (css = "#_desktop_user_info a")
    private WebElement signIn;


    public MenuPage searchForProduct (String name){
        searchInput.sendKeys(name);
        return this;
    }

    public BasketPage openBasketPage(){
        basketQuantity.click();
        return new BasketPage(getDriver());
    }

    public int getBasketQuantity(){
        return Integer.parseInt(
                basketQuantity.getText()
                    .replace("(", "")
                    .replace(")", ""));
    }

    public SignInPage goToSignInPage(){
        signIn.click();
        return new SignInPage(getDriver());
    }

}
