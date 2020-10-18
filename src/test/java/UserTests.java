
import models.User;
import pages.commons.MenuPage;
import providers.UserFactory;

public class UserTests extends BaseTest {

    public void shouldRegisterNewUser() {
        User randomUser = new UserFactory().getUserToRegister();

        new MenuPage(getDriver())
                .goToSignInPage()
                .registerNewUser()
                .registerUser(randomUser);
    }

    public void shouldLoginWithExistingUser() {
        User existingUser = new UserFactory().getAlreadyRegisteredUser();

        new MenuPage(getDriver())
                .goToSignInPage()
                .loginUser(existingUser);
    }

}