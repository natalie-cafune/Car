package Car;

public class Main {
    public static void main(String[] args) {

        CarWheel carWheel = new CarWheel(0.7);
        carWheel.printData();
        carWheel.wipeOff(10);
        carWheel.newWheell();
        carWheel.printData();
        System.out.println();

        Car car1 = new Car("01.01.18", "Gas", 190,
                5,5,4);

        car1.getDoorIndex(1);
        System.out.println(car1.getWheelIndex(2));
        car1.printInfoCar();
        car1.setNewWheels(4);
        System.out.println(car1.getCurrentMaxSpeed());
    }
}
