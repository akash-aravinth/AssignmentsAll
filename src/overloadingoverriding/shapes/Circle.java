package overloadingoverriding.shapes;

public class Circle extends Shapes{

    private int radius;
    Circle(int radius){
        this.radius = radius;
    }
    @Override
    public void area() {
        System.out.println("The area of the Circle is : "+Math.PI*radius*radius);
    }
}
