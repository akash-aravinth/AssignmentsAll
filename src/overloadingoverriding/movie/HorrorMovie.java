package overloadingoverriding.movie;

public class HorrorMovie extends Movie{
    @Override
    public void whichMovie() {
        System.out.println("HorrorMovie....");
    }
}
