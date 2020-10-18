package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage { //w przypadku dziedziczenia, tworzymy żeby gdzieś tam ózniej mogło być wykorzystywane
    private WebDriver driver; //z klasy abstrakcyjnej nie możemy stworzyć obiektu to jest zabezpieczenie zeby nie można było jej zainicjowac
    private Actions actionsDriver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        actionsDriver = new Actions(driver);
        PageFactory.initElements(driver, this); // tutaj żeby nie pisać tego w innyhch klasach, bo bedziemy dziedziczyć
    }

    public WebDriver getDriver() {
        return driver;
    }

    public Actions getActionsDriver() {
        return actionsDriver;
    }


}
