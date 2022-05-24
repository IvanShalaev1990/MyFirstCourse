package ua.com.foxminded.mod;

public class MODTest {
    public static void main(String[] args) {
        Mod mod = new Mod();

        if (mod.mod() == 4) {
            System.out.println("Your number is right");
            System.out.println(mod.mod());
        }else {
            System.out.println("Your number is wrong");
            System.out.println(mod.mod());
        }

    }
}
