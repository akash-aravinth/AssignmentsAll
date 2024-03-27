package overloadingoverriding.movie;

public class Main {
    public static void main(String[] args) {
        HorrorMovie horrorMovie = new HorrorMovie();
        horrorMovie.whichMovie();
        ThrillerMovie thrillerMovie = new ThrillerMovie();
        thrillerMovie.whichMovie();
        RomComMovie romComMovie = new RomComMovie();
        romComMovie.whichMovie();
        Movie movie = new Movie();
        movie.whichMovie();
    }
}
