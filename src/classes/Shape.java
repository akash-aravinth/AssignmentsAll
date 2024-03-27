package classes;

public class Shape {
    public double findAreaofRectangle(double breath,double length){
        return breath*length;
    }
    public double findAreaOfTrainangel(double base,double height){
        return (base/height)/2;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(30,30);
    }
}
