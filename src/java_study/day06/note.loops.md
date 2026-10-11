1. Słownik
Klasa - szablon(Project) w którym są określone dane (pola), metody które będą miały obiekty tej klasy
Obiekt - instancja danej klasy otworzona przez new ktora posiada własne wartości pól
instancja - obiekt danej klasy
pole - zmienna zadeklarowana w klasie, która przechowuje dane obiektu 
metoda - blok kodu wykonujący konkretne zadanie
konstuktor - specjalny blok kodu w którym inicjalizyjemy wartości polom danego obiektu, nie jest to metoda
modyfikator dostępu - określa kto może korzystać z kanego pola, klasy , metody czy konstuktora
static - określa że dana metoda czy pole należą do klasy nie do obiektu. w przypadku pola tworzy sie jedna kopia 
dla wszystich obiektów, do metod static jest dostęp bez tworzenia obiektu dlatego też main jest static
deklaracja - nadanie typu i nazwy zmeinnej
inicjalizacja - nadanie pierwszej wartości zmiennej
wywołanie - uruchamianie np. metody na obiekcie lub klasie
odwołanie - odczytanie zmiennej lub pola

2. Rozgrzewka
1. instancja to obiekt danej klasy, tworzy sie do za pomocą new
2.
int a; - deklaracja
int b = 4; - deklaracja i inicjalizacja
System.out.println(b); - wypisanie zmiennej b
System.out.println(a); - wypisanie zmiennej a // błąd bo sie nie skompiluje ponieważ zmienna z nie ma zainicjalizowanej
wartośći przez co program wyrzuci błąd java: variable a might not have been initialized
a = 2; inicjalizacja
3. 29 % 6 = 5, a (byte) 300 wypisze  = 44
4. wypisze 0 ponieważ metoda zwraca count. Count jako pole nawet niezainicjalizowane na wartość podstawową 0;
i wywołujemy na nowym obiekcie metodę show
5.
int p = 1; zmienna zadeklarowana i zainicjalizowna 
for (int i = 1; i <= 4; i++) { pętla której wartośc początkowa to jeden; warunek który sprawdza czy nasze i jest
mniejsze bądz równe 4 jeżeli tak to iteracja sie wykona; inkrementacja - zwiększenie wartości o jeden
    if (i % 2 == 0) continue; warunek który sprawdza czy i jest lidzbą parzystą jeżeli tak przechodzi do kolejnej iteracji
    p *= i; jeżeli nie mnoży i dodaje wartość (i) do zmiennej p
}
System.out.println(p); wyświetli 3
6. sout sie nie skompiluje ponieważ zmienna y instnieje tylko i wyłącznie w if sout jej nie widzi

Dlaczego metody klasy Loops muszą być static - żeby można było wywołać je bez tworzenia obiektu tylko wywołać je na klasie
a gdyby usunąc static trzeba by było utwożyć obiekt i na nim wywoływać metodę
Loops loops = new Loops();
loops.evenSumIf();