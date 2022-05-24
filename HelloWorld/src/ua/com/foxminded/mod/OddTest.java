package ua.com.foxminded.mod;

import java.util.Random;

public class OddTest {
    public static void main(String[] args) {
        Random random = new Random();
        Odd myOdd = new Odd();
        boolean isTrue = false;
        int counter = 0;
        while (!isTrue) {
            counter++;
            int myRandomOne = random.nextInt(1,1000);
            int myRandomTwo = random.nextInt(1,1000);

            if (myOdd.odd(myRandomOne, myRandomTwo) == 0) {
                System.out.println("Your  number is odd");
                System.out.println(counter);
                isTrue = true;
            }else {
                System.out.println("Your  number is not odd");
            }
        }
    }
}
