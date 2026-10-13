package java_study.day08.movie;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    private String title;
    private Genre genre;
    private int durationMinutes;
    private final double rating;

    private static final List<Movie> movies = new ArrayList<>();

    public Movie(String title, Genre genre, int durationMinutes, double rating) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }
        this.title = title;
        if (genre == null) {
            throw new IllegalArgumentException("Genre cannot be null");
        }
        this.genre = genre;
        if (durationMinutes <= 0) {
            throw new IllegalArgumentException("\"Duration must be positive, got: \" + durationMinutes");
        }
        this.durationMinutes = durationMinutes;
        if (rating < 0 || rating > 10) {
            throw new IllegalArgumentException("Rating is from 0 to 10");
        }
        this.rating = rating;
        movies.add(this);
    }

    public static int countByGenre(Genre genre) {
        if (genre == null) {
            throw new IllegalArgumentException("Wrong genre");
        }
        int count = 0;
        for (Movie movie : movies) {
            if (movie.getGenre() == genre) {
                count++;
            }
        }
        return count;
    }

    public static double averageRating(Genre genre) {
        if (genre == null) {
            throw new IllegalArgumentException("Wrong genre");
        }
        double sum = 0;
        for (Movie movie : movies) {
            if (movie.getGenre() == genre) {
                sum += movie.getRating();
            }
        }
        int count = countByGenre(genre);
        if (count == 0) {
            throw new IllegalArgumentException("No movies in genre: " + genre);
        }
        return sum / count;
    }

    public static Movie longest() {
        if (movies.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
        Movie result = movies.getFirst();
        for (Movie movie : movies) {
            if (movie.getDurationMinutes() > result.getDurationMinutes()) {
                result = movie;
            }
        }
        return result;
    }

    public static Movie bestRated(Genre genre) {
        if (genre == null) {
            throw new IllegalArgumentException("Wrong genre");
        }
        Movie result = null;
        for (Movie movie : movies) {
            if (movie.getGenre() == genre && (result == null || movie.getRating() > result.getRating())) ;
            result = movie;
        }
        if (result == null) {
            throw new IllegalArgumentException("No movies in genre: " + genre);
        }
        return result;
    }

    public static List<Movie> findByGenre(Genre genre) {
        if (genre == null) {
            throw new IllegalArgumentException("Wrong genre");
        }
        List<Movie> result = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getGenre() == genre) {
                result.add(movie);
            }
        }
        return result;
    }

    public static List<Movie> getMovies() {
        return movies;
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public double getRating() {
        return rating;
    }
}
