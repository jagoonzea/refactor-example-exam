package be.ucll.craftsmanship;

public class Square extends Rectangle {

    Square(double width, double height) {
        super(width, height);
    }

    public double getLongLength() {
        return super.getLongLength();
    }

    public double getShortLength() {
        return super.getShortLength();
    }

    public void setShortLength(double shortLength) {
        super.setShortLength(shortLength);
        super.setLongLength(shortLength);
    }

    public void setLongLength(double longLength) {
        super.setLongLength(longLength);
        super.setShortLength(longLength);
    }
}
