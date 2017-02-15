package Task1;

import java.util.Objects;

public class Pen {


    private String color;
    private double price;

    private Pen(String color, double price){
        this.color = color;
        this.price = price;
    }

    public static void main(String[] args) {
        Pen pen = new Pen("red", 45 );
        Pen pen1 = new Pen("blue", 43);
        System.out.println(pen.equals(pen1));
        System.out.println(pen.toString());
        System.out.println(pen1.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pen)) return false;
        Pen pen = (Pen) o;
        return Double.compare(pen.price, price) == 0 &&
                Objects.equals(color, pen.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, price);
    }

    @Override
    public String toString() {
        return "I'm a pen{" +
                "my ink color is '" + color + '\'' +
                ", price=" + price +
                '}';
    }
}

