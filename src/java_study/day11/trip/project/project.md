Klasa - 
Client / pola name, surname, address
Trip / pola name, (enum)country, price , list<Addon>  
Addon (enum)/ pola name, price
relacje wiele do wielu Client *<--->* Trip

metody - 
w Client metoda static Client howSpendMoreMoneyForAddon ()
w client metoda static Client howSpendMoreMoneyForAll ()
