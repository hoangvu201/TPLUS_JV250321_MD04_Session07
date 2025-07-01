import java.util.Scanner;

public class Dog extends Animals {
    private String breed;

    public Dog() {
        super();
    }

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void inputData(Scanner sc) {
        super.inputData(sc);
        System.out.print("Giống chó: ");
        breed = sc.nextLine();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Giống chó: " + breed);
    }

    @Override
    public String makeSound() {
        return "Woof Woof";
    }

    // Getter nếu cần
    public String getBreed() {
        return breed;
    }
}
