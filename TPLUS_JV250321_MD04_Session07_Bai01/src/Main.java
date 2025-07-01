import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animals[] animals = new Animals[10];
        int currentIndex = 0;
        System.out.print("Nhập số lượng động vật: ");
        int count = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < count; i++) {
            System.out.print("Nhập loại động vật (Dog|Cat): ");
            String petType = sc.nextLine();
            switch (petType) {
                case "Cat":
                    animals[currentIndex] = new Cat();
                    animals[currentIndex].inputData(sc);
                    break;
                default:
                    animals[currentIndex] = new Dog();
                    animals[currentIndex].inputData(sc);
                    break;
            }
            currentIndex++;
        }
        System.out.println();
        for (int i = 0; i < count; i++) {
            animals[i].displayInfo();
            System.out.println("Âm thanh: " + animals[i].makeSound());
            System.out.println();
        }

        sc.close();
    }
}
