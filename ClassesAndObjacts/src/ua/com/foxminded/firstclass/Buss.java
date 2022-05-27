package ua.com.foxminded.firstclass;

public class Buss extends Car{
    public Buss(String name, int yearOfProduction, int price, int weight, Color color, EnginType enginType, int mileage, boolean isReadyToDrive, int mileageSinceLastService, boolean needService) {
        super(name, yearOfProduction, price, weight, color, enginType, mileage, isReadyToDrive, mileageSinceLastService, needService);
    }

    @Override
    public boolean needService() {
        if (mileageSinceLastService < 0){
            throw new IllegalArgumentException("mileageSinceLastService can't be negative");
        }
        if (mileageSinceLastService > 50000){
            System.out.println("You should bo on service " + (mileageSinceLastService-50000) + " mile ago");
            return true;
        }
        return false;
    }
}
