package overloadingoverriding.movie;

public class ThrillerMovie extends Movie{
    @Override
    public void whichMovie() {
        System.out.println("ThrillerMovie....");
    }
}
