package pages.commons;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;
import pages.basket.BasketPage;
import pages.products.SearchResultPage;
import pages.user.SignInPage;

public class MenuPage  {
    private WebDriver driver;

    public MenuPage(WebDriver driver){
        this.driver = driver; //jesśli super tzn ze dziedziczymy z Base wiec musi być botam jest konstruktor
        PageFactory.initElements(driver, this);

    }

    @FindBy (css = ".ui-autocomplete-input")
    private WebElement searchInput;

    @FindBy (css = ".cart-products-count")
    private WebElement basketQuantity;

    @FindBy (css = "#_desktop_user_info a")
    private WebElement signIn;

    @FindBy (css = ".account")
    private WebElement userName;

    @FindBy (css = ".logout")
    private WebElement signOut;


    public SearchResultPage searchForProduct(String name) {
        searchInput.sendKeys(name);
        searchInput.sendKeys(Keys.ENTER);
        return new SearchResultPage(driver);
    }

    public BasketPage openBasketPage(){
        basketQuantity.click();
        return new BasketPage(driver);
    }

    public int getBasketQuantity(){
        return Integer.parseInt(
                basketQuantity.getText()
                    .replace("(", "")
                    .replace(")", ""));
    }

    public SignInPage goToSignInPage(){
        signIn.click();
        return new SignInPage(driver);
    }

    public String getDisplayedUserName(){
        return userName.getText();
    }

}
