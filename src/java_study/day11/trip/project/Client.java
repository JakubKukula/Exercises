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
    // jeżeli będziemy chcieli dodać anna.addTrip(spain) drugi raz to metoda sie zacończy odrazu po trips.contains(trip)
    // bo warunek będzie true i return zakonczy metodę
    public void addTrip(Trip trip) {
        if (trip == null) {
            throw new IllegalArgumentException("Trip cannot be null");
        }
        if (trips.contains(trip)) {
            return;
        }
        trips.add(trip);
        trip.addClient(this);
    }

    public double tripsCost() {
        double result = 0;
        for (Trip trip : trips) {
            result += trip.getPrice();
        }
        return result;
    }

    public double addonsCost() {
        double result = 0;
        for (Trip trip : trips) {
            result += trip.sumAddons();
        }
        return result;
    }

    public static Client findTopTotalSpender(List<Client> clientList) {
        if (clientList == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        Client result = null;
        double topSpend = 0;
        for (Client client : clientList) {
            double spend = client.tripsCost() + client.addonsCost();
            if (topSpend < spend) {
                result = client;
                topSpend = spend;
            }
        }
        return result;
    }

    public static Client findTopAddonSpender(List<Client> clientList) {
        if (clientList == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        Client result = null;
        double topAddonsSpender = 0;
        for (Client client : clientList) {
            double addonsCost = client.addonsCost();
            if (topAddonsSpender < addonsCost) {
                result = client;
                topAddonsSpender = addonsCost;
            }
        }
        return result;
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
