package overloadingoverriding.vechicle;

public class Bike extends Vechicle{
    @Override
    public void start() {
        System.out.println("Bike Start");
    }

    @Override
    public void stop() {
        System.out.println("Bike stop");
    }
}
