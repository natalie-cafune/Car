package Car;

public class Car {
    private final String dateOfManufacture;

    private String engineType;

    private int maxSpeed;
    private int accelerationTime;
    private int passCapacity;
    private int amountPassInCar;
    private int currentSpeed;


    private CarDoor [] amountOfDoors = new CarDoor[]{new CarDoor(false, false),
            new CarDoor(false, false),new CarDoor(false , false),
            new CarDoor(false, false)};
    private CarWheel [] amountOfWheels = new  CarWheel[] {new CarWheel(0.5),new CarWheel(0.2),
            new CarWheel(0.4), new CarWheel(1.0)};


    public Car(String  dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public Car(String dateOfManufacture, String engineType, int maxSpeed, int accelerationTime,
               int passCapacity, int amountPassInCar) {
        this.dateOfManufacture = dateOfManufacture;
        this.engineType = engineType;
        this.maxSpeed = maxSpeed;
        this.accelerationTime = accelerationTime;
        this.passCapacity = passCapacity;
        this.amountPassInCar = amountPassInCar;
    }

    public String getDateOfManufacture() {
        return dateOfManufacture;
    }
    // установить скорость
    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    // добавить пассажира
    public void putPass (){
        this.amountPassInCar = amountPassInCar + 1;
    }

    // высадить одного пассажира
    public void removePass(){
        if(this.amountPassInCar == 0){
            System.out.println("There are no passengers");
        }
        else {
            this.amountPassInCar = amountPassInCar - 1;
        }
    }

    // высадить всех пассажиров
    public void removeAllPass(){
        this.amountPassInCar = 0;
    }

    // получить дверь по индексу      !!!!!!!!!!!
    public void getDoorIndex (int index){
        if (amountOfDoors == null){
            System.out.println("No doors");
        }
        //System.out.println("");
        this.amountOfDoors[index].printInfoCarDoor();
    }

    // получить колесо по индексу
    public double getWheelIndex (int index){

        if (amountOfWheels == null) {
            System.out.println("No wheels! ");
        }
        System.out.print("Value wheel of index " + index + " is - ");
        return this.amountOfWheels[index].getStateWhell();
    }

    // снять все колеса с машины
    public void takeOfAllWheels (){
        this.amountOfWheels = new CarWheel[0];

    }

    // установить на машину Х колёс
    public void setNewWheels (int amount){
        this.amountOfWheels = new CarWheel[4 + amount];
    }

    // какая из шин максимально стёрта
    public double wipeOffWheel( CarWheel [] amountOfWheels){
        double  min = amountOfWheels[0].getStateWhell();
        for (int i = 0; i < amountOfWheels.length; i++ ){
            if (min > (amountOfWheels[i].getStateWhell())){
                min = amountOfWheels[i].getStateWhell();
            }
        }
        return min;
    }

    //вычеслить текущую максимальную скорость
    public double getCurrentMaxSpeed (){
        double currMAxSpeed;
        if (amountPassInCar == 0){
            currMAxSpeed = 0;
        }
        else {
            currMAxSpeed = maxSpeed * (wipeOffWheel(amountOfWheels));
        }
        System.out.print("Max cuurrent speed is ");
        return currMAxSpeed;
    }

    private void printArrayOfWheels (CarWheel [] amountOfWheels){
        for (int i = 0; i < amountOfWheels.length; i++ ){
            double a = amountOfWheels[i].getStateWhell();
            System.out.print( a + " ");
        }
    }
    public void printInfoCar (){
        System.out.println("Date of Manufacture " + dateOfManufacture);
        System.out.println("Type of engine " + engineType);
        System.out.println("Max speed " + maxSpeed);
        System.out.println("Acceleration time " + accelerationTime);
        System.out.println("Pass capacity " + passCapacity);
        System.out.println("Amount pass in car " + amountPassInCar);
        System.out.print("Amount of wheels - " );
        printArrayOfWheels(amountOfWheels);
        System.out.println();
        System.out.println("Current speed " + currentSpeed);

    }
}
