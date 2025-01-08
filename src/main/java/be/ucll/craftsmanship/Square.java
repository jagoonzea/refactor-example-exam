package be.ucll.craftsmanship;

public class Square extends Rectangle {

    Square(int width, int height) {
        super(width, height);
    }

    public int getLongLength() {
        return longLength;
    }

    public int getShortLength() {
        return shortLength;
    }

    public void setShortLength(int shortLength) {
        this.shortLength = shortLength;
        this.longLength = shortLength;
    }

    public void setLongLength(int longLength) {
        this.longLength = longLength;
        this.shortLength = longLength;
    }
}
