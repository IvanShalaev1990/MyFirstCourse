package ua.com.foxminded.arithmeticdouble;

public class ArithmeticDoubleTest {
    public static void main(String[] args) {

        ArithmeticDouble ard = new ArithmeticDouble();

        if(ard.addMultiplay() == 23.5){
            System.out.println("Your number is right");
            System.out.println(ard.addMultiplay());
        }else {
            System.out.println("Your number is wrong");
            System.out.println(ard.addMultiplay());
        }
    }
}
