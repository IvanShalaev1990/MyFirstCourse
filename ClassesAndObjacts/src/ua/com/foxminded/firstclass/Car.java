package ua.com.foxminded.firstclass;

public class Car {
    String name;
    int yearOfProduction;
    int price;
    int weight;
    String color;
    String enginType;
    boolean isReadyToDrive;

    public Car() {
    }

    public Car(String name, int yearOfProduction, int price, int weight, String color, String enginType, boolean isReadyToDrive) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.enginType = enginType;
        this.isReadyToDrive = isReadyToDrive;
    }

    @Override
    public String toString() {
        return "Car{" +
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
