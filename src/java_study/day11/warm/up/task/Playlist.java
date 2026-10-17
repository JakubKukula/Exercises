package java_study.day11.warm.up.task;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private String name;

    private List<Song> songList = new ArrayList<>();

    public Playlist(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public void addSong(Song song) {
        if (song == null){
            throw new IllegalArgumentException("Song cannot be null");
        }
        if (songList.contains(song)) {
            throw new IllegalArgumentException("This song was already added");
        }
        songList.add(song);
    }

    public int totalSeconds() {
        int result = 0;
        for (Song song : songList) {
            result += song.getSeconds();
        }
        return result;
    }

    public int secondsOfGenre(Genre genre) {
        if (genre == null) {
            throw new IllegalArgumentException("Genre cannot be null");
        }
        int result = 0;
        for (Song song : songList) {
            if (song.getGenre() == genre) {
                result += song.getSeconds();
            }
        }
        return result;
    }

    public static Playlist longest(List<Playlist> playlistList) {
        if (playlistList == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        Playlist result = null;
        int longestPlaylist = 0;
        for (Playlist playlist : playlistList) {
            int length = playlist.totalSeconds();
            if (result == null || longestPlaylist < length) {
                result = playlist;
                longestPlaylist = length;
            }
        }
        return result;
    }

    public static Playlist mostOfGenre(List<Playlist> playlistList, Genre genre) {
        if (playlistList == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        Playlist result = null;
        int longestBeGenre = 0;
        for (Playlist playlist : playlistList) {
            int length = playlist.secondsOfGenre(genre);
            if (longestBeGenre < length) { // length sprawdza też czy dana playlista posiada podany gatunek
                result = playlist;
                longestBeGenre = length;
            }
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public List<Song> getSongList() {
        return new ArrayList<>(songList);
    }

    @Override
    public String toString() {
        return name + " ";
    }
}
