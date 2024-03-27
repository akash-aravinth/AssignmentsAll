package overloadingoverriding.shapes;

public class Main {
    public static void main(String[] args) {
        Shapes square=new Square(10);
        Shapes circle = new Circle(5);
        Shapes rectangle = new Rectangle(4,5);
        square.area();
        circle.area();
        rectangle.area();
    }
}
