Klasa - 
Client / pola name, surname
Trip / pola name, (enum)country, price , list<Addon>  
Addon (enum)/ pola name, price
relacje wiele do wielu Client *<--->* Trip

metody - 
w Client metoda static Client findTopTotalSpender ()
w client metoda static Client findTopAddonSpender ()

anna.addTrip(spain)  #1
trips.contains(spain)?        anna.trips = []     → false
spain.addClient(anna)  #1     ← wołasz drugą stronę, ZANIM dodasz
clients.contains(anna)?   spain.clients = []  → false
anna.addTrip(spain)  #2     
trips.contains(spain)?   anna.trips = []  → false
czyli co to sie nie kończy 
...

spain.addClient(anna)  #1
clients.contains(anna)?   spain.clients = []   → false
clients.add(anna)         spain.clients = [anna]
anna.addTrip(spain)  #1
trips.contains(spain)?   anna.trips = []   → false
trips.add(spain)         anna.trips = [spain]
spain.addClient(anna)  #2
clients.contains(anna)?   spain.clients = [anna]  → true
return kończy metod i w drugiej także wynik z contains bedzie true wiec konczy metode
← koniec tak
← koniec tak

Stan końcowy:  anna.trips = [spain]   spain.clients = [anna]

