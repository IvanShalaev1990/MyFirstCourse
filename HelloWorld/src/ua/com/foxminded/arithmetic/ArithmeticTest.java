package ua.com.foxminded.arithmetic;

public class ArithmeticTest {

    public static void main(String[] args) {
        Arithmetic ar = new Arithmetic();
        if(ar.add() == 45){
            System.out.println("Your number is correct");
            System.out.println(ar.add());
        }else {
            System.out.println("Wrong number!!!");
            System.out.println(ar.add());
        }

    }

}
