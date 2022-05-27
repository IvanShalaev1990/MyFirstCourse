package ua.com.foxminded.firstclass;

public interface Serviceable {
     void mileageIncrease(int mileage);
     void mileageSinceLastService(int mileage);
     boolean needService();
     boolean service();
}
