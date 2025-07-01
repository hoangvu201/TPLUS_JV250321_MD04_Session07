import java.util.Scanner;

public class Animals {
    protected String name;
    protected int age;

    public Animals() {}

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void inputData(Scanner sc) {
        System.out.print("Tên: ");
        name = sc.nextLine();
        System.out.print("Tuổi: ");
        age = Integer.parseInt(sc.nextLine());
    }

    public void displayInfo() {
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
    }

    public String makeSound() {
        return "Some generic sound";
    }

    // Getter/Setter nếu cần
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
