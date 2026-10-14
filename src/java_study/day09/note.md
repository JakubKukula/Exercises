1.Słownik
ekntensja klasy - statyczna lista przechowująca obiekty danej klasy. obiekty dodaję sie w konstuktorze podczas tworzenia
obiektu
enum - klasa która zawiera konkretne wartości enuma, może zawierać konsturktor jak i można nadać im wartość
relacja wiele do wielu - jeden obiekt A może być powiązany z wieloma obiektami B, a jeden B z wieloma A. 
np. klient może być na wielu wycieczkach a wycieczka ma wielu klientów.
compareTo - porównuje dwa napisy i zwraca liczbę. jeżeli liczba jest ujemna to napis po lewej jest wcześniej jeżeli
liczba jest 0 to oba są takie same jeżeli zwróci liczbę dodatnią to napis po lewej jest póżniej.

zadanie 2.
"Ala".compareTo("Ola") = -1
"kot".compareTo("kot") = 0
"Zosia".compareTo("ala") = +1
"Kasia".compareTo("Kamil") = +1

zadanie 3.
Dlaczego lista w ekstensji jest static? Co by się stało, gdyby nie była?
Gdyby lista nie była static to każdy obiekt miałby swoją listę z tylko swoim obiektem

Dlaczego getEmployees() powinien zwracać kopię listy, a nie samą listę?
żeby nikt nie mógł zrobić Employee.getEmployeeList.clear() i usunąc zawartość listy