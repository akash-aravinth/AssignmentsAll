package overloadingoverriding.vechicle;

public class Car extends Vechicle{
    @Override
    public void start() {
        System.out.println("Car Start");
    }

    @Override
    public void stop() {
        System.out.println("Car stop");
    }
}
