package constructor.geometryshape;

public class Shape {
    public void print(){
        System.out.println("Print Shape");
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.print();
    }
}
