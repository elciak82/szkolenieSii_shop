
package pages.home;

import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.products.ProductsGridPage;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
        productsGridPage = new ProductsGridPage(driver);
    }

    private ProductsGridPage productsGridPage;

    public ProductsGridPage getPopularProducts() {
        return productsGridPage;
    }
}