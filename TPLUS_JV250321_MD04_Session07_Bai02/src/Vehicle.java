public abstract class Vehicle {
    private  String name;
    private int speed;
    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }
    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setName(String name) {
        this.name = name;
    }

    public abstract void displayInfo();

    public void start() {
        System.out.println("Vehicle is starting...");
    }
}
