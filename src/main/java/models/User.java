package models;

public class User { //przechowuje dane uzytkownika, transporter danych
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private int gender; //lepszy enum

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public int getGender() {
        return gender;
    }

    public User(String firstName, String lastName,
                String password, String email, int gender) { //buider lepszy
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.gender = gender;
    }



}
