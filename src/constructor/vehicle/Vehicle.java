package constructor.vehicle;

public class Vehicle {

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    private String model;
    private int year;

    public Vehicle() {

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void print(){
        System.out.println("Vehicle");
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car("toyoto",10);
        Bike bike = new Bike("yamaha",1000000);
        vehicle.print();
        car.getYear();
        bike.getYear();
    }
}
