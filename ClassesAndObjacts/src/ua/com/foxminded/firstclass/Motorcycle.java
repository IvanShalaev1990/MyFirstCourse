package ua.com.foxminded.firstclass;

import java.util.Locale;
import java.util.Objects;
import java.util.Random;

public class Motorcycle {
    String name;
    int yearOfProduction;
    int price;
   int weight;
    Color color;
    EnginType enginType;
    int mileage;
    boolean isReadyToDrive;
    public  Motorcycle(){

    }
    public Motorcycle(String name, int yearOfProduction,
                      int price, int weight, Color color,
                      EnginType enginType, int mileage,
                      boolean isReadyToDrive){
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.enginType = enginType;
        this.mileage = mileage;
        this.isReadyToDrive = isReadyToDrive;
    }
    public void mileageIncrease(int mileage){
        if(mileage < 0){
            throw new IllegalArgumentException("Mileage can't be negative");
        }
        this.mileage += mileage;
    }
    public void mileageIncrease(double mileage){
        this.mileage += mileage;
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
        return "Motorcycle{" +
                "name='" + name + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", price=" + price +
                ", weight=" + weight +
                ", color=" + color +
                ", enginType=" + enginType +
                ", mileage=" + mileage +
                ", isReadyToDrive=" + isReadyToDrive +
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
        Motorcycle that = (Motorcycle) obj;
        return  name.equals(that.name) &&
                price == that.price &&
                color == that.color &&
                isReadyToDrive == isReadyToDrive;
    }
}
