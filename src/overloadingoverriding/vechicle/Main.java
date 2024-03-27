package overloadingoverriding.vechicle;

public class Main {
    public static void main(String[] args) {
        Vechicle vechicle = new Vechicle();
        vechicle.start();
        vechicle.stop();
        Car car = new Car();
        car.start();
        car.stop();
        Bike bike = new Bike();
        bike.start();
        bike.stop();
        Cycle cycle = new Cycle();
        cycle.start();
        cycle.stop();
        Vechicle v1 = new Car();
        v1.stop();
        v1.start();
    }
}
