package ua.com.foxminded.firstclass;

public class CarManager {
    public static void main(String[] args) {
        Car toyota = new Car(
                "Toyota Prius",
                2008,
                15000,
                1200,
                Color.ORANGE.toString(),
                "gas",
                true);
        Car daewo = new Car(
                "Daewo Lanos",
                2007,
                3800,
                1350,
                Color.ORANGE.toString(),
                "gas",
                true);
        Car renault = new Car(
                "Renault Laguna",
                2008,
                9700,
                1600,
                Color.ORANGE.toString(),
                "gas",
                true);
        Motorcycle suzuki = new Motorcycle(
                "Suzuki GSX-R1000",
                2021,
                16000,
                600,
                Color.ORANGE.toString(),
                "diesel",
                true);
        Motorcycle yamaha = new Motorcycle(
                "Yamaha  FZ1",
                2007,
                9000,
                700,
                Color.ORANGE.toString(),
                "gas",
                false);
        System.out.println(daewo.toString());
        System.out.println(suzuki.toString());
    }
}
