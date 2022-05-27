package ua.com.foxminded.firstclass;

public enum EnginType {
    PETROL("Petrol"),
    DIESEL("Diesel"),
    NATURAL_GAS("Natural gas");
    private String enginType;
    EnginType(String enginType){
        this.enginType = enginType;
    }
    public String getEnginType(){
        return enginType;
    }

    @Override
    public String toString() {
        return  this.enginType;
    }
}
