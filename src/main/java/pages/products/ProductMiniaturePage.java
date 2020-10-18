package pages.products;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;
import pages.BasePage;

public class ProductMiniaturePage extends BasePage {

    public ProductMiniaturePage(WebDriver driver, WebElement parent) {
        super(driver);
        PageFactory.initElements(new DefaultElementLocatorFactory(parent), this);
    }

    @FindBy(css = ".product-title")
    private WebElement name;

    @FindBy(css = ".price")
    private WebElement price;

    @FindBy(css = ".regular-price")
    private WebElement priceBeforeDiscount;

    @FindBy(css = ".discount-percentage")
    private WebElement discountValue;

    public String getName() {
        return name.getText();
    }

    public String getPrice() {
        return price.getText();
    }

    public String getDiscount() {
        return discountValue.getText();
    }

    public String getRegularPrice() {
        return price.getText();
    }

    public ProductDetailsPage open() {
        name.click();
        return new ProductDetailsPage(getDriver());
    }
}