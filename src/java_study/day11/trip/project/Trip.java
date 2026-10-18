package java_study.day11.trip.project;

import java.util.ArrayList;
import java.util.List;

public class Trip {

    private String name;
    private Country country;
    private double price;
    private List<Addon> addons = new ArrayList<>();

    private List<Client> clients = new ArrayList<>();

    public Trip(String name, Country country, double price) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
        if (country == null) {
            throw new IllegalArgumentException("Country cannot be null");
        }
        this.country = country;
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be less than 0");
        }
        this.price = price;
    }

    public double sumAddons() {
        double result = 0;
        for (Addon addon : addons) {
            result += addon.getPrice();
        }
        return result;
    }

    public void addAddon(Addon addon) {
        if (addon == null) {
            throw new IllegalArgumentException("Addon cannot be null");
        }
        addons.add(addon);
    }
    // jeżeli będziemy chcieli dodać spain.addClient(anna) drugi raz to metoda sie zacończy odrazu po trips.contains(trip)
    // bo warunek będzie true i return zakonczy metodę
    public void addClient(Client client) {
        if (client == null) {
            throw new IllegalArgumentException("Client cannot be null");
        }
        if (clients.contains(client)) {
            return;
        }
        clients.add(client);
        client.addTrip(this);

    }

    public String getName() {
        return name;
    }

    public Country getCountry() {
        return country;
    }

    public double getPrice() {
        return price;
    }

    public List<Addon> getAddons() {
        return new ArrayList<>(addons);
    }

    public List<Client> getClients() {
        return new ArrayList<>(clients);
    }

    @Override
    public String toString() {
        return name + " " + country + " " + price;
    }
}
