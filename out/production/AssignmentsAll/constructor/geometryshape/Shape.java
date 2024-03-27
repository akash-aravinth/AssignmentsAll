package constructor.geometryshape;

public class Shape {
    public void print(){
        System.out.println("Print Shape");
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.print();
        Shape shape1 = new Circle();
        shape1.print();
        Shape shape2 = new Square();
        shape2.print();
        Shape shape3 = new Rectangle();
        shape3.print();
    }
}
