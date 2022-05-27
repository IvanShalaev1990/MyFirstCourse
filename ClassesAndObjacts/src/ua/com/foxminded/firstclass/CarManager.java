package ua.com.foxminded.firstclass;

public class CarManager {
    public static void main(String[] args) {
        PassengerCar toyota = new PassengerCar(
                "Toyota Prius",
                2008,
                15000,
                1280,
                Color.ORANGE,
                EnginType.PETROL,
                150000,
                true,
                10000,
                false);
        PassengerCar daewo = new PassengerCar(
                "Daewo Lanos",
                2007,
                3800,
                1350,
                Color.ORANGE,
                EnginType.NATURAL_GAS,
                120000,
                true,
                9000,
                false);
        PassengerCar renault = new PassengerCar(
                "Renault Laguna",
                2008,
                9700,
                1600,
                Color.ORANGE,
                EnginType.DIESEL,
                180000,
                true,
                15000,
                false);
        Buss bogdan = new Buss(
                "Bogdan",
                2007,
                30000,
                5400,
                Color.ORANGE,
                EnginType.DIESEL,
                150000,
                true,
                0,
                false);
        Motorcycle suzuki = new Motorcycle(
                "Suzuki GSX-R1000",
                2021,
                16000,
                700,
                Color.ORANGE,
                EnginType.PETROL,
                200000,
                true);
        Motorcycle yamaha = new Motorcycle(
                "Yamaha  FZ1",
                2007,
                9000,
                600,
                Color.ORANGE,
                EnginType.PETROL,
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
                EnginType.PETROL,
                200000,
                false);
        bogdan.mileageIncrease(51000.5);
        System.out.println(bogdan.mileageSinceLastService);
        System.out.println(bogdan.needService());
        System.out.println(bogdan.service());
    }
}
