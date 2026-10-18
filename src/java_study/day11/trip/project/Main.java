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



        /*
    === 1. WYDATKI (rozpisz sumy) ===
    Anna:   tripsCost  = italy                 = 6000
            addonsCost = transfer                 = 150
    Piotr:  tripsCost  = greece + egypt             = 3500
            addonsCost = (ALL_INCLUSIVE + GUIDE) + (INSURANCE + DINNER) = 1675
    Ola:    tripsCost  = egypt + spain             = 4000
            addonsCost = INSURANCE + DINNER             = 175
    Marek:  tripsCost  = spain                 = 2500
            addonsCost =                  = 0

    === 2. ŚLAD findTopAddonSpender ===
    start: result = null, topAddonsSpender = 0
    1. Anna:  addonsCost = 150   0 < 150 → true   result = anna   top = 150
    2. Piotr: addonsCost = 1675   150 < 1675 → true   result = piort   top = 1675
    3. Ola:   addonsCost = 175   1675 < 175 → false   result = piort   top = 1675
    4. Marek: addonsCost = 0   1675 < 0 → false   result = piort   top = 1675
    wynik: Piotr Nowak

    === 3. SYNCHRONIZACJA (przewidywanie → potem uruchom) ===
    italy.getClients()  = [ Anna Kowalska ]
    greece.getClients() = [ Piotr Nowak ]
    egypt.getClients()  = [ Piotr Nowak, Ola Wiśniewska ]     ← dodawane raz od klienta, raz od wycieczki
    spain.getClients()  = [ Ola Wiśniewska, Marek Wójcik ]
    piotr.getTrips()    = [ Kreta GREECE 2000.0, Hurghada EGYPT 1500.0 ]
    ola.getTrips()      = [ Hurghada EGYPT 1500.0, Barcelona SPAIN 2500.0 ]
    */

        System.out.println(Client.findTopTotalSpender(clients)); //Anna Kowalska
        System.out.println(Client.findTopAddonSpender(clients)); //Piotr Nowak

        System.out.println(italy.getClients());
        System.out.println(greece.getClients());
        System.out.println(egypt.getClients());
        System.out.println(spain.getClients());
        System.out.println(piotr.getTrips());
        System.out.println(ola.getTrips());
    }
}
