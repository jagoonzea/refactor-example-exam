package be.ucll.craftsmanship;

public class Rectangle extends Shape {
    Rectangle(int width, int height) {
        this.shortLength = Math.min(width, height);
        this.longLength = Math.max(width, height);
    }

}
