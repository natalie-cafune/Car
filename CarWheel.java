package Car;

public class CarWheel {
    private double stateWheel;

    public CarWheel (){
    }

    public CarWheel (double stateWheel){
        this.stateWheel = stateWheel;
    }

    // Смена шины на новую
    public void newWheell (){
        this.stateWheel = 1.0f;
    }

    // Стереть шину на X%
    public void wipeOff(int interest){
        double a  = (stateWheel * 100 ) - interest;
        System.out.println(this.stateWheel = a / 100);
    }

    //Получить состояние (return)
    public double getStateWhell (){
        return stateWheel;
    }

    // вывести состояние объекта
    public void printData (){
        System.out.println("State of wheel is - " + getStateWhell());
    }

}
