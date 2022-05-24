package ua.com.foxminded.mod;

public class OddBoolean {
    public boolean oddBoolean(int numOne){
        if(numOne == 0){
            throw new IllegalArgumentException("Number cannot be a zero");
        }
        if((numOne%2)!=0){
            return false;
        }
        return true;
    }
}
