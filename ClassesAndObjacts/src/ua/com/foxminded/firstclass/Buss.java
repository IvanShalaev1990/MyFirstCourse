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
            return needService = true;
        }
        return needService = false;
    }

    @Override
    public boolean service() {
        if (needService == true){
            System.out.println("Service was done");
            return needService = false;
        }
        System.out.println("You have " + (50000 - mileageSinceLastService) + " until next service");
        return needService = false;
    }

    @Override
    public void mileageIncrease(int mileage) {
        if(mileage < 0){
            throw new IllegalArgumentException("MileageSinceLastService");
        }
        this.mileage +=mileage;
        mileageSinceLastService(mileage);
    }

    @Override
    public void mileageSinceLastService(int mileage) {
            if(mileage < 0){
                throw new IllegalArgumentException("MileageSinceLastService");
            }
            mileageSinceLastService += mileage;
    }
}
