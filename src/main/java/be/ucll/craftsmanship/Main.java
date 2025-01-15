package be.ucll.craftsmanship;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape rectangle = shapeFactory.create(1, 4);
        Shape square = shapeFactory.create(2, 2);

        double areaRectangle = rectangle.area();
        double areaSquare = square.area();

        System.out.println(rectangle);
        System.out.println("Rectangle has an area of: " + areaRectangle);

        System.out.println(square);
        System.out.println("Square has an area of: " + areaSquare);
    }
}