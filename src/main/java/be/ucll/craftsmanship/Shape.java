package be.ucll.craftsmanship;

public abstract class Shape {
    private double shortLength;
    private double longLength;

    abstract double area();

    public double getShortLength() {
        return this.shortLength;
    }

    public void setShortLength(double length) {
        this.shortLength = length;
    }

    public double getLongLength() {
        return this.longLength;
    }

    public void setLongLength(double length) {
        this.longLength = length;
    }
}
