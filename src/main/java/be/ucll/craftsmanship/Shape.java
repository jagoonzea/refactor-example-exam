package be.ucll.craftsmanship;

public abstract class Shape {
    public int shortLength;
    public int longLength;

    int area() {
        return shortLength * longLength;
    }
}
