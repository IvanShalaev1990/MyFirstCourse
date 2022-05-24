package ua.com.foxminded.firstclass;

import java.util.Locale;

public class Motorcycle {
    String name;
    int yearOfProduction;
    int price;
    int weight;
    String color;
    String enginType;
    boolean isReadyToDrive;
    public  Motorcycle(){

    }
    public Motorcycle(String name, int yearOfProduction, int price, int weight, String color, String enginType, boolean isReadyToDrive){
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.weight = weight;
        this.color = color.toUpperCase(Locale.ROOT).replace(" ", "");
        this.enginType = enginType;
        this.isReadyToDrive = isReadyToDrive;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "name='" + name + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", price=" + price +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", enginType='" + enginType + '\'' +
                ", isReadyToDrive=" + isReadyToDrive +
                '}';
    }
}
