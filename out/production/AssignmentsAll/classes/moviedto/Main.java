package classes.moviedto;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setMovieName("Vikram");
        movie.setDirectorName("Logesh Kanagaraj");
        movie.setMovieCollection(70000000.097);
        Movie.setMovieLanguage("Tamil");
        System.out.println("Moveie Name : "+movie.getMovieName()+"\nMovie Director Name : "+movie.getDirectorName()+
                "\nMovie Collection is : "+movie.getMovieCollection()+"\nMovie Language in "+Movie.getMovieLanguage());
    }
}
