package be.ucll.craftsmanship;

public class Rectangle extends Shape {

    @Override
    double area() {
        return this.getShortLength() * this.getLongLength();
    }

    Rectangle(double width, double height) {
        this.setShortLength(Math.min(width, height));
        this.setLongLength(Math.max(width, height));
    }
}
