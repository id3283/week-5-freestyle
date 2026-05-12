package inheritance;

public class Developer extends Person {
    String favoriteLanguage;

    public Developer(String name, int age, String favoriteLanguage) {
        super(name, age);

        this.favoriteLanguage = favoriteLanguage;
//        System.out.println("I'm making a developer 🤓");
    }

    public void beLazy() {
        System.out.println("I'm not gonna do that.");
    }


    @Override
    public void work() {
        System.out.println("I'm a developer, and I'm coding.");
    }


    @Override
    public String toString() {
        return "Name: " + this.name + " Favorite programming language: " + this.favoriteLanguage;
    }
}
