package pages.products;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class SearchResultPage extends BasePage {
    public SearchResultPage(WebDriver driver) {
        super(driver);
        waitForVisibilityOf(By.cssSelector(".total-products"));
        productsGridPage = new ProductsGridPage(driver);
    }

    private ProductsGridPage productsGridPage;

    public ProductsGridPage getSearchResults() {
        return productsGridPage;
    }
}