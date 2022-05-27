package ua.com.foxminded.firstclass;

import java.util.Objects;

public abstract class Car implements Serviceable{
    String name;
    int yearOfProduction;
    int price;
    int weight;
    Color color;
    EnginType enginType;
    int mileage;
    boolean isReadyToDrive;
    int mileageSinceLastService;
    boolean needService;

    public Car() {
    }

    public Car(String name, int yearOfProduction, int price, int weight, Color color, EnginType enginType, int mileage, boolean isReadyToDrive, int mileageSinceLastService, boolean needService) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.enginType = enginType;
        this.mileage =mileage;
        this.isReadyToDrive = isReadyToDrive;
        this.mileageSinceLastService = mileageSinceLastService;
        this.needService = needService;
    }
    public boolean destroyTheEngin(){
        if (mileage < 250000){
            return isReadyToDrive = true;
        }else {
            return isReadyToDrive = false;
        }
    }
    public boolean repair(){
        if (isReadyToDrive == true){
            System.out.println("Engin is okay");
            return isReadyToDrive = true;
        }
        return isReadyToDrive = true;
    }
    public Color paint(){
        return color = Color.GREEN;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", price=" + price +
                ", weight=" + weight +
                ", color=" + color +
                ", enginType=" + enginType +
                ", mileage=" + mileage +
                ", isReadyToDrive=" + isReadyToDrive +
                ", mileageSinceLastService=" + mileageSinceLastService +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Car that = (Car) obj;
        if (that.name == null || that.enginType == null)
            return false;
        return  name.equals(that.name) &&
                price == that.price &&
                yearOfProduction == that.yearOfProduction &&
                color == that.color;

    }
}
