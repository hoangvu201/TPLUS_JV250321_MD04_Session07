import java.util.Scanner;

public class Cat extends Animals {
    private String furColor;

    public Cat() {
        super();
    }

    public Cat(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    @Override
    public void inputData(Scanner sc) {
        super.inputData(sc);
        System.out.print("Màu lông: ");
        furColor = sc.nextLine();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Màu lông: " + furColor);
    }

    @Override
    public String makeSound() {
        return "Meow Meow";
    }

    // Getter nếu cần
    public String getFurColor() {
        return furColor;
    }
}
