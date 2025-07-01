import java.awt.*;

public class Rectangle implements IColorable {
    private double width;
    private double height;
    private String color;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public void display() {
        System.out.printf("Hình chữ nhật có chiều rộng: %.1f, chiều dài: %.1f, màu sắc: %s\n",this.width, this.height, this.color);
    }
}
