//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0,6.0);
        Square square = new Square(3.0);


        circle.setColor("Đỏ");
        rectangle.setColor("Xanh dương");
        square.setColor("Vàng");

        circle.display();
        rectangle.display();
        square.display();
    }
}