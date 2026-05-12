package staticstuff;

public class MyFactory {
    private MyFactory() {}

    public static MyFactory makeFactory() {
        return new MyFactory();
    }

}
