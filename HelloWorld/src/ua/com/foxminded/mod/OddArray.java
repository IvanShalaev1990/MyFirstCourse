package ua.com.foxminded.mod;

import java.util.ArrayList;

public class OddArray {
        public ArrayList<Integer> oddArrayRemove(ArrayList<Integer> list) {
            for (int i = 0; i < list.size(); i++) {
                if ((list.get(i) % 2) > 0) {
                    list.remove(i);
                }
            }
            return list;
        }
}
