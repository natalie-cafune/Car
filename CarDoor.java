package Car;

public class CarDoor {
    private boolean doorOpen;
    private boolean windowOpen;

    public CarDoor() {
        this.doorOpen = false;
        this.windowOpen = false;
    }

    public CarDoor(boolean doorOpen, boolean windowOpen) {
        this.doorOpen = doorOpen;
        this.windowOpen = windowOpen;
    }

    public void setCloseDoor (boolean doorOpen){
        this.doorOpen = doorOpen;
        System.out.println("The door is closed");
    }
    public void setOpenDoor(boolean doorOpen) {
        this.doorOpen = doorOpen;
        System.out.println("The door is opened");

    }

    public boolean getCloseDoor(){
        return doorOpen;
    }

    public boolean getOpenDoor(){
        return doorOpen;
    }
    public boolean isDoorOpen(boolean doorOpen) {
        if (doorOpen == true){
            setCloseDoor(true);        }
        else if (doorOpen == false){
            setOpenDoor(true);
        }
        return doorOpen;
    }

    public void setOpenWindow(boolean windowOpen) {
        this.windowOpen = windowOpen;
        System.out.println("The window is opened");
    }

    public void setCloseWindow(boolean windowOpen) {
        this.windowOpen = windowOpen;
        System.out.println("The window is closed");
    }
    public boolean getOpenWindow (){
        return windowOpen;
    }

    public boolean getCloseWindow (){
        return windowOpen;
    }

    public boolean isWindowOpen(boolean windowOpen) {
        if (windowOpen == true){
            setCloseWindow(true);        }
        else if (windowOpen == false){
            setOpenWindow(true);
        }
        return windowOpen;
    }

    public void printInfoCarDoor(){
        System.out.println(isDoorOpen(doorOpen) );
        System.out.println(isWindowOpen(windowOpen));
        System.out.println();

    }
}
