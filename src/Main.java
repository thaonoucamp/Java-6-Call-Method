public class Main {
    public static void main(String[] args) {
        float width = 4.5f;
        float height = 3.4f;

        float periR = Rectangle.perimeter(width, height);
        float areaR = Rectangle.area(width, height);

        System.out.println("Rectangle:");
        System.out.println("Perimeter of Rectangle: " + periR);
        System.out.println("Area of Rectangle: " + areaR);

        float radius = 2f;
        System.out.println("Circle:");
        System.out.println("Area: " + Circle.area(radius));
        System.out.println("Peri: " + Circle.perimeter(radius));

        float side = 4.5f;
        System.out.println("Square:");
        System.out.println("Area: " + Square.area(side));
        System.out.println("Peri: " + Square.perimeter(side));



    }
}
