package ua.com.foxminded.firstclass;

public class CarManager {
    public static void main(String[] args) {
        Car bogdan = new Buss(
                "Bogdan",
                2005,
                30000,
                8900,
                Color.ORANGE,
                EnginType.DIESEL,
                0,
                true,
                0,
                false);
        bogdan.mileageIncrease(49000);
        System.out.println(bogdan.mileage);
        bogdan.needService();
        System.out.println(bogdan.needService);
        System.out.println(bogdan.service());
    }
}
