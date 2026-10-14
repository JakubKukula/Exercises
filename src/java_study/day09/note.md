1.Słownik
ekntensja klasy - obiekt lub lista która zzawiera obiekty danej klasy z metodą odwołania sie do niej
enum - klasa która zawiera konkretne wartości enuma, może zawierać konsturktor jak i można nadać im wartość
relacja wiele do wielu - dwie klasy zapisują swoje obiekty 
compareTo - nie pamiętam

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