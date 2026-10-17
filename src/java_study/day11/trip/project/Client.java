package java_study.day11.trip.project;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private String name;
    private String surname;

    private List<Trip> trips = new ArrayList<>();

    public Client(String name, String surname) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
        if (surname == null || surname.isBlank()) {
            throw new IllegalArgumentException("Surname cannot be null or empty");
        }
        this.surname = surname;
    }

    public void addTrip(Trip trip){
        if (trips.contains(trip)){
            throw new IllegalArgumentException("Trip " + trip + " was already added to the list");
            // ta walidacja nie jest potrzebna?
        }
        trips.add(trip);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public List<Trip> getTrips() {
        return new ArrayList<>(trips);
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
