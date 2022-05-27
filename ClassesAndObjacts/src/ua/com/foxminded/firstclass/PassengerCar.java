package ua.com.foxminded.firstclass;

public class PassengerCar extends Car{
    public PassengerCar(String name, int yearOfProduction, int price, int weight, Color color, EnginType enginType, int mileage, boolean isReadyToDrive, int mileageSinceLastService, boolean needService) {
        super(name, yearOfProduction, price, weight, color, enginType, mileage, isReadyToDrive, mileageSinceLastService, needService);
    }
}
