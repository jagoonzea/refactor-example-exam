package be.ucll.craftsmanship;

public class ShapeFactory {
    public Shape create(int length1, int length2) {
        
        if (length1 == length2) {
            return new Square(length1, length2);
        }

        return new Rectangle(length1, length2);
    }
}
