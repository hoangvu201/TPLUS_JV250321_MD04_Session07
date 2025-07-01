import java.awt.*;

public class Circle implements IColorable {
    private double radius;
    private String color;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {

    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
    public void display() {
        System.out.println("Hình tròn có bán kính: " + radius +", màu sắc: " + color);
    }
}
