public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota Camry", 180);
        Vehicle bike = new Bike("Honda Winner", 120);

        car.start();
        car.displayInfo();

        bike.start();
        bike.displayInfo();
    }
}
