package ictgradschool.web.example02;

public class Person {

    private String firstName;
    private String lastName;
    private String[] favoriteAnimals;

    public Person() {
    }

    public Person(String firstName, String lastName, String[] favoriteAnimals) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.favoriteAnimals = favoriteAnimals;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String[] getFavoriteAnimals() {
        return favoriteAnimals;
    }

    public void setFavoriteAnimals(String[] favoriteAnimals) {
        this.favoriteAnimals = favoriteAnimals;
    }
}
