package ua.com.foxminded.firstclass;

public enum Color {
    BLACK("Black"),
    ORANGE("Orange"),
    WHITE("White"),
    YELLOW("Yellow"),
    BLUE("Blue"),
    GREEN("Green");
    private String color;
    Color(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return getColor();
    }
}
