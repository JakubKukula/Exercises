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
            throw new IllegalArgumentException("County cannot be null");
        }
        this.country = country;
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be less than 0");
        }
        this.price = price;
    }

    public void addAddons(Addon addon) {
        if (addon == null) {
            throw new IllegalArgumentException("Addon cannot be null");
        }
        if (addons.contains(addon)) {
            throw new IllegalArgumentException("This " + addon + "  was already added to the list");
        }
        addons.add(addon);
    }

    public void addClient(Client client) {
        if (clients.contains(client)) {
            throw new IllegalArgumentException("Client " + client + " was already added to the list");
        }
        clients.add(client);
        client.addTrip(this);
    }

    public Client findWhoSpendMoreMoney(List<Trip> tripList) {
        if (tripList == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        Client result = null;
        double topSpend = 0;
        for (Trip trip : tripList) {

        }
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
