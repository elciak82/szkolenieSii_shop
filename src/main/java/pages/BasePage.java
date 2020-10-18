package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.commons.MenuPage;

import java.util.List;
import java.util.Random;

public class BasePage {
    private WebDriver driver;
    private Actions actionsDriver;
    private MenuPage menuPage;
    private WebDriverWait defaultWait;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        actionsDriver = new Actions(driver);
        menuPage = new MenuPage(driver);
        defaultWait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    public MenuPage getMenu() {
        return menuPage;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public Actions getActionsDriver() {
        return actionsDriver;
    }

    public WebElement getRandomElement(List<WebElement> elements) {
        Random rnd = new Random();
        int randNumber = rnd.nextInt(elements.size());
        return elements.get(randNumber);
    }

    public WebElement waitForVisibilityOf(By by) {
        return defaultWait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
}
