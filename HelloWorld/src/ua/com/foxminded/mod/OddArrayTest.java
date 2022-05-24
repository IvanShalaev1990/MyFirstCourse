package ua.com.foxminded.mod;

import java.util.ArrayList;
import java.util.Random;

public class OddArrayTest {
    public static void main(String[] args) {

        OddArray oddArray = new OddArray();

        Random random = new Random();

        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < random.nextInt(50,100); i++) {
            myList.add(random.nextInt(100));
        }
        System.out.println(myList);
        System.out.println(oddArray.oddArrayRemove(myList));

    }
}
