package pages.products;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.ArrayList;
import java.util.List;

public class ProductsGridPage extends BasePage {
    public ProductsGridPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".product-miniature")
    private List<WebElement> productMiniatureElements;

    public String getNameOfRandomProduct() {
        return new ProductMiniaturePage(getDriver(),
                getRandomElement(productMiniatureElements))
                .getName();
    }

    public List<ProductMiniaturePage> getAllProductMiniatures() {
        List<ProductMiniaturePage> allMiniatures = new ArrayList<>();
        for (WebElement miniatureElement : productMiniatureElements) {
            allMiniatures.add(new ProductMiniaturePage(getDriver(), miniatureElement));
        }
        return allMiniatures;
    }

    public List<String> getAllProductName() {
        List<String> allProductNames = new ArrayList<>();
        for (ProductMiniaturePage miniature : getAllProductMiniatures()) {
            allProductNames.add(miniature.getName());
        }
        return allProductNames;
    }
}