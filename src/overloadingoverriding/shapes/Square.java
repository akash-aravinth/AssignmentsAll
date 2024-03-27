package overloadingoverriding.shapes;

class Square extends Shapes{
    private int width;
    Square(int width){
        this.width = width;
    }

    @Override
    public void area() {
        System.out.println("The Width of The Square is : "+width*width);
    }
}
