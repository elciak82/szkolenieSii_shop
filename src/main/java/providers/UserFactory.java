package providers; //tworzą obiekty innych klas

import models.User;
import org.apache.commons.lang3.RandomStringUtils;

public class UserFactory {
    public User getUserToRegister(){ //losowanie danych - biblioteka do dependency
        String name = getRandomText();
        String lastName = getRandomText();
        String email = getRandomText()+ "@wp.pl";
        String password = getRandomText();
        int gender = 1;
        return new User(name, lastName, email, password, gender);
    }

    public User getAlreadyRegisteredUser() {
        return new User("Jan", "Kowalski",
        "werty", "j@pl", 1); // to powinno być brane z bazy banych, lub procedura sql
        //najlepiej nowy użytkownik, stwóż a potem usuń
    }

    private String getRandomText(){
       return RandomStringUtils.random(7, true, false);
    }
}
