package java_study.day08.movie;

import javax.smartcardio.CommandAPDU;

public class Main {
    public static void main(String[] args) {

        new Movie("Interstellar", Genre.SCI_FI, 169, 9.5);
        new Movie("Zielona mila", Genre.DRAMA, 189, 8.9);
        new Movie("Joker", Genre.DRAMA, 122, 8.4);
        new Movie("Whiplash", Genre.DRAMA, 106, 8.7);
        new Movie("Matrix", Genre.SCI_FI, 136, 8.6);
        new Movie("Kac Vegas", Genre.COMEDY, 100, 7.7);
        new Movie("Miś", Genre.COMEDY, 112, 8.1);
        new Movie("Seksmisja", Genre.COMEDY, 121, 7.9);

        System.out.println(Movie.countByGenre(Genre.DRAMA));

        System.out.println(Movie.countByGenre(Genre.HORROR));

        System.out.println(Movie.averageRating(Genre.COMEDY));

//        System.out.println(Movie.averageRating(Genre.HORROR)); wyrzuca wyjątek

        System.out.println(Movie.longest());

        System.out.println(Movie.bestRated(Genre.DRAMA));

        System.out.println(Movie.bestRated(Genre.SCI_FI));

        System.out.println(Movie.findByGenre(Genre.COMEDY));

        System.out.println(Movie.getMovies());
    }
}
