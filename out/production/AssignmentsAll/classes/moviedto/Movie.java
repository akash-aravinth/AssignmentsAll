package classes.moviedto;

public class Movie {
   private String movieName;
   private String directorName;
   private double movieCollection;
   private static String movieLanguage;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public double getMovieCollection() {
        return movieCollection;
    }

    public void setMovieCollection(double movieCollection) {
        this.movieCollection = movieCollection;
    }

    public static String getMovieLanguage() {
        return movieLanguage;
    }

    public static void setMovieLanguage(String movieLanguage) {
        Movie.movieLanguage = movieLanguage;
    }
}
