package ua.com.foxminded.firstclass;

public class CarManager {
    public static void main(String[] args) {
        Car toyota = new Car(
                "Toyota Prius",
                2008,
                15000,
                1280,
                Color.ORANGE,
                "gas",
                150000,
                true);
        Car daewo = new Car(
                "Daewo Lanos",
                2007,
                3800,
                1350,
                Color.ORANGE,
                "gas",
                120000,
                true);
        Car renault = new Car(
                "Renault Laguna",
                2008,
                9700,
                1600,
                Color.ORANGE,
                "gas",
                180000,
                true);
        Motorcycle suzuki = new Motorcycle(
                "Suzuki GSX-R1000",
                2021,
                16000,
                700,
                Color.ORANGE,
                "diesel",
                200000,
                true);
        Motorcycle yamaha = new Motorcycle(
                "Yamaha  FZ1",
                2007,
                9000,
                600,
                Color.ORANGE,
                "gas",
                200000,
                false);
        yamaha.mileageIncrease(100000.7);
        yamaha.destroyTheEngin();
        yamaha.repair();
        yamaha.paint();
        Motorcycle yamahaTwo = new Motorcycle(
                "Yamaha  FZ1",
                2007,
                9000,
                600,
                Color.ORANGE,
                "gas",
                200000,
                false);
        System.out.println(yamaha.toString());
        System.out.println(yamaha.equals(yamahaTwo));
    }
}
