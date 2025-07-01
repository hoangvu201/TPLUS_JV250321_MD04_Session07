import java.awt.*;

public class Square implements IColorable{
    private double width;
    private String color;

    public Square() {
    }
    public Square(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public void display() {
        System.out.printf("Hình vuông có cạnh: %.1f, màu sắc: %s",this.width, this.color);

    }
}
