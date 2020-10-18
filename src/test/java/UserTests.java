import models.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.home.HomePage;
import pages.user.RegistrationPage;
import pages.user.SignInPage;
import providers.UserFactory;

public class UserTests extends BaseTest {
    @Test
    public void shouldRegisterNewUser() {
        User randomUser = new UserFactory().getUserToRegister();

        new HomePage(getDriver())
                .getMenu()
                .goToSignInPage()
                .registerNewUser()
                .registerUser(randomUser);

        String expectedUserName = randomUser.getFirstName() + " " + randomUser.getLastName();
        Assert.assertEquals(new HomePage(getDriver()).getMenu().getDisplayedUserName(), expectedUserName);

    }

    @Test
    public void shouldRegisterNewUser2ndVersion() {
        User randomUser = new UserFactory().getUserToRegister();

        new HomePage(getDriver())
                .getMenu()
                .goToSignInPage();

        new SignInPage(getDriver())
                .registerNewUser();

        new RegistrationPage(getDriver())
                .registerUser(randomUser);
    }

    @Test
    public void shouldLoginWithExistingUser() {
        User existingUser = new UserFactory().getAlreadyRegisteredUser();

        HomePage homePage = new HomePage(getDriver());
        homePage
                .getMenu()
                .goToSignInPage()
                .loginUser(existingUser);

        Assert.assertEquals(homePage.getMenu().getDisplayedUserName(), "Jan Kowalski");
    }

}