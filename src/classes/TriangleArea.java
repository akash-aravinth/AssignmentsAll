package classes;
class Traiangle{
    Traiangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    public double findArea(){
        return base*height;
    }
    private double base;
    private double height;
}