package overloadingoverriding.movie;

public class RomComMovie extends Movie{
    @Override
    public void whichMovie() {
        System.out.println("RomComMovie.....");
    }
}
