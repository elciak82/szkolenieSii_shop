import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public WebDriver getDriver() {
        return driver;
    }

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "src\\main\\resources\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        driver = new ChromeDriver(options);
        driver.get("http://5.196.7.235/");
    }

    @AfterMethod
    public void cleanUp() {
        driver.quit();
    }
}
