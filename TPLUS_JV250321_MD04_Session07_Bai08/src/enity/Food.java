package entity;

public class Food extends entity.Product {
    public Food (String name, double price) {
        super(name, price);
    }

    @Override
    public double getDiscount () {
        return super.getDiscount() * 0.05;
    }
}