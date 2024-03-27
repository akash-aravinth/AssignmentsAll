package overloadingoverriding.shapes;

public class Rectangle extends Shapes{
    private int height;
    private int width;
    Rectangle(int height,int width){
        this.height = height;
        this.width = width;
    }

    @Override
    public void area() {
        System.out.println("Rectangle area is : "+height*width);
    }
}
