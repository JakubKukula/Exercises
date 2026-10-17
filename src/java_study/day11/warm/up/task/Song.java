package java_study.day11.warm.up.task;

import java.util.Objects;

public class Song {

    private final String title;
    private final int seconds;
    private final Genre genre;

    public Song(String title, int seconds, Genre genre) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        this.title = title;
        if (seconds <= 0) {
            throw new IllegalArgumentException("Seconds cannot be less than 0");
        }
        this.seconds = seconds;
        if (genre == null) {
            throw new IllegalArgumentException("Genre cannot be null");
        }
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public int getSeconds() {
        return seconds;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Song song)) return false;
        return seconds == song.seconds && Objects.equals(title, song.title) && genre == song.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, seconds, genre);
    }

    @Override
    public String toString() {
        return title + " " + seconds + " " + genre;
    }
}
