package java_study.day11.trip.project;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Stwórz klase klient i wycieczka, klient moze miec wiele wycieczek, wycieczka
        //moze miec wielu klientow. Wycieczka ma nazwe, kraj, cena i liste dodatkow
        // (kazdy jest dodatkowo platny) Znadz klienta który wydal najwiecej na dodatki
        //do wycieczki uwzgledniajac tez cene wycieczki Znadz klienta który wydal
        //najwiecej na dodatki do wycieczki nieuwzgledniajac tez ceny wycieczki

        Trip italy  = new Trip("Rzym Premium", Country.ITALY, 6000);
        italy.addAddon(Addon.TRANSFER);

        Trip greece = new Trip("Kreta", Country.GREECE, 2000);
        greece.addAddon(Addon.ALL_INCLUSIVE);
        greece.addAddon(Addon.GUIDE);

        Trip egypt  = new Trip("Hurghada", Country.EGYPT, 1500);
        egypt.addAddon(Addon.INSURANCE);
        egypt.addAddon(Addon.DINNER);

        Trip spain  = new Trip("Barcelona", Country.SPAIN, 2500);

        Client anna  = new Client("Anna", "Kowalska");
        Client piotr = new Client("Piotr", "Nowak");
        Client ola   = new Client("Ola", "Wiśniewska");
        Client marek = new Client("Marek", "Wójcik");

        anna.addTrip(italy);        // od strony klienta
        greece.addClient(piotr);    // od strony wycieczki
        piotr.addTrip(egypt);
        egypt.addClient(ola);
        ola.addTrip(spain);
        spain.addClient(marek);

        List<Client> clients = new ArrayList<>(List.of(anna, piotr, ola, marek));

        System.out.println(Client.findTopTotalSpender(clients)); //Anna Kowalska
        System.out.println(Client.findTopAddonSpender(clients)); //Piotr Nowak
    }
}
