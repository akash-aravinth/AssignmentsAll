package overloadingoverriding.vechicle;

public class Cycle extends Vechicle{
    @Override
    public void start() {
        System.out.println("Cycle start");
    }

    @Override
    public void stop() {
        System.out.println("Cycle stop");
    }
}
