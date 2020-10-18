
package pages.products;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class CategoriesPage extends BasePage {
    public CategoriesPage(WebDriver driver) {
        super(driver);
        productsGridPage = new ProductsGridPage(driver);
    }

    private ProductsGridPage productsGridPage;

    public ProductsGridPage getProductsGridPage() {
        return productsGridPage;
    }
}