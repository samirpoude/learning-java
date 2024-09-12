public class Car {
    private String make = "tesla";
    private String colour = "Model X";
    private String model = "gray";
    private int door = 2;
    private boolean convertible = true;

    public String getMake() {
        return make;
    }

    public String getColour() {
        return colour;
    }

    public int getDoor() {
        return door;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public String getModel(){
        return model;
    }

    public void describeCar(){
        System.out.println(door + " - doors " +
                colour + " " +
                make + " " +
                model + " " +
                (convertible ? "convertible" : ""));
    }
}
