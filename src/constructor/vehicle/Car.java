package constructor.vehicle;

public class Car extends Vehicle{

    public Car(String carName, int noOfCar) {
        super();
        this.carName = carName;
        this.noOfCar = noOfCar;
    }

    private String carName;
    private int noOfCar;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getNoOfCar() {
        return noOfCar;
    }

    public void setNoOfCar(int noOfCar) {
        this.noOfCar = noOfCar;
    }

    public void print(){
        System.out.println("Car");
    }
}
