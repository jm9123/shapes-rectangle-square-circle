public class Main {
    public static void main(String args[]){
        Circle circle = new Circle("red", 3);
        System.out.println(circle.calculateArea());
        circle.display();

        Triangle triangle = new Triangle("blue", 1 ,3);
        System.out.println(triangle.calculateArea());
        System.out.println(triangle.calculatePerimeter());
        triangle.display();

        Rectangle rectangle = new Rectangle("green", 2,3);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());
        rectangle.display();

        Square square = new Square("orange", 5);
        System.out.println(square.calculateArea());
        square.display();

        Shape s = new Square("blue", 5);

        ((Square) s).test();
    }
}
