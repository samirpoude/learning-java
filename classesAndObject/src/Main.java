public class Main {
    public static void main(String[] args){
        Car car = new Car();
        car.setMake("porsche");
        car.setModel("Carerra");
        car.setDoor(2);
        car.setConvertible(true);
        car.setColour("black");

        System.out.println("make = "+ car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();

        Car targa = new Car();
        targa.setMake("Porsche");
        targa.setColour("red");
        targa.setMake("targa");
        targa.setConvertible(false);
        targa.setDoor(2);

        targa.describeCar();


    }
}
