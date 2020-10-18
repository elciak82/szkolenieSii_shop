package providers;

import models.User;
import org.apache.commons.lang3.RandomStringUtils;

public class UserFactory {
    public User getUserToRegister() {
        String name = getRandomText();
        String lastName = getRandomText();
        String email = getRandomText() + "@wp.pl";
        String password = getRandomText();
        int gender = 1;
        return new User(name, lastName,
                password, email, gender);
    }

    public User getAlreadyRegisteredUser() {
        return new User("Jan", "Kowalski",
                "qweasdzxc", "j.k@wp.pl", 1);
    }

    private String getRandomText() {
        return RandomStringUtils.random(7, true, false);
    }
}