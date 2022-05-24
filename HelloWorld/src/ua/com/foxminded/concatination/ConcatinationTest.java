package ua.com.foxminded.concatination;

public class ConcatinationTest {
    public static void main(String[] args) {

        Concatination con = new Concatination();

        String check = "Hello World! 40";

        if(con.oneMoreAnswer.equals(check)){
            System.out.println("Your string is right");
            System.out.println(con.oneMoreAnswer);
        }else {
            System.out.println("Your string is wrong");
            System.out.println(con.oneMoreAnswer);
        }
    }
}
