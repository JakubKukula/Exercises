package java_study.day11.warm.up.task;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Playlist chill = new Playlist("Chill");
        chill.addSong(new Song("A", 200, Genre.JAZZ));
        chill.addSong(new Song("B", 180, Genre.POP));
        chill.addSong(new Song("C", 240, Genre.JAZZ));

        Playlist gym = new Playlist("Gym");
        gym.addSong(new Song("D", 210, Genre.ROCK));
        gym.addSong(new Song("E", 230, Genre.POP));
        gym.addSong(new Song("F", 180, Genre.ROCK));

        Playlist party = new Playlist("Party");
        party.addSong(new Song("G", 200, Genre.POP));
        party.addSong(new Song("H", 250, Genre.POP));

        Playlist empty = new Playlist("Empty");

        List<Playlist> playlists = new ArrayList<>(List.of(chill, gym, party, empty));

        /*
        longest(playlists) = Chill
        mostOfGenre(playlists, Genre.POP) = Party
        mostOfGenre(playlists, Genre.ROCK) = Gym
        mostOfGenre(playlists, Genre.CLASSICAL) = null / zwróciło Chill po przestudiowaniu metody to przez
        result == null. czy jets to błąd w naszym działaniu
        */

        System.out.println(Playlist.longest(playlists));
        System.out.println(Playlist.mostOfGenre(playlists, Genre.POP));
        System.out.println(Playlist.mostOfGenre(playlists, Genre.ROCK));
        System.out.println(Playlist.mostOfGenre(playlists, Genre.CLASSICAL));

    }
}
