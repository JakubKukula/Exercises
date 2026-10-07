dlaczego main jest static?
main jest static właśnie po to, żeby JVM mogła go uruchomić bez obiektu
tak samo jak nie wywołamy metody statycznej bez odwołania sie do danej klasy

Klasa - szablon, który opisuje, jakie dane (pola) i metody będą miały obiekty tego typu
Obiekt - instancja danej klasy utworzona przez (new) z własnymi wartościami pól
Instancja - inne słowo na obiekt "instancja klasy Student" = obiekt klasy student
Pole - Zmienna zadeklarowana w klasie, poza metodami. Przechowuje dane obiektu(albo klasy jak jest static) 
Metoda - nazwany blok kody w klasie, który coś robi. może przyjmować parametry i zwracać wartość
Konstruktor - Specjalny blok wywołany przez (new), który ustawia początkowy stan obiektu !(nie jest metodą)
Modyfikator dostępu - określa KTO może korzystać z klasy, pola, metody, lub konstruktora(public, protected,privat)
static - mówi, że element należy do klasy, a nie do obiektu. jedna kopia, dostęp bez tworzenia obiektu

1. Od kodu do uruchomienia
Piszesz Main.java. Kompilator javac zamienia go na Main.class, czyli bytecode: kod pośredni, nie dla procesora, tylko dla JVM.
JVM (Java Virtual Machine) wykonuje bytecode. Każdy system ma swoją JVM, dlatego ten sam .class działa na Windowsie, Linuksie i Macu.
JRE = JVM + biblioteki standardowe (np. String, Scanner). Wystarcza do uruchamiania programów.
JDK = JRE + narzędzia programisty, m.in. javac. Potrzebny do pisania programów.

2. Osiem typów prostych (prymitywnych)

Typ	    Rozmiar	  Co przechowuje
byte	1 bajt	  liczba całkowita od −128 do 127
short	2 bajty	  liczba całkowita
int	    4 bajty	  liczba całkowita, ok. ±2,1 mld
long	8 bajtów  duża liczba całkowita, literał z L: 3000000000L
float	4 bajty	  liczba zmiennoprzecinkowa, literał z f: 1.5f
double	8 bajtów  liczba zmiennoprzecinkowa (domyślna)
char	2 bajty	  jeden znak, pod spodem liczba (kod znaku)
boolean	   —	  true / false

Zasada literałów: liczba bez kropki to domyślnie int, liczba z kropką to domyślnie double.

3. Typy referencyjne: 
Wszystko, co nie jest prymitywem: String, tablice, obiekty twoich klas. Zmienna takiego typu przechowuje referencję 
do obiektu, a nie sam obiekt. Może przechowywać null, czyli brak obiektu.

4. Stos i sterta:
Stos: zmienne lokalne i parametry metod. Znikają po zakończeniu metody.
Sterta: obiekty utworzone przez new (razem z ich polami).
Student s = new Student("Ola"); w metodzie: referencja s jest na stosie, obiekt jest na stercie.

5. Rzutowanie (konwersja typów)
Rozszerzające, automatyczne, bez utraty danych: int → long → double.
Zawężające, trzeba je zapisać jawnie: (int) 9.99 daje 9. Obcina, nie zaokrągla.

6. Pułapki arytmetyki
7 / 2 daje 3. Gdy obie liczby są int, dzielenie jest całkowite, a reszta przepada.
Przepełnienie: Integer.MAX_VALUE + 1 daje Integer.MIN_VALUE. Bez błędu i bez ostrzeżenia, liczba „zawija się” na drugi koniec zakresu.
char to liczba: 'A' + 1 daje 66.

Pomyłki z TypeExpreriment
System.out.println(7 % 2); // nie wiem ale myślę żę 3
7 % 2 daje 1. % to reszta z dzielenia. 7 / 2 = 3 * 2 = 6 więc zostaje 1.

System.out.println((byte) 200); // wyrzuci bład bo byte mieści wartości od -128 do 127
wynik to -56 dlaczego? byte ma 256 możliwości w zakresie od -128 do 127, jeżeli lidzba wynosi np. 
400 odejmujemy od niej 256 = 144 liczba dalej nie mieści sie w zakresie więc odejmujemy dalej 256 = - 112 
a dla liczb ujemnych dodajemy 256

final :
Gdzie	          Co blokuje
zmienna lokalna   ponowne przypisanie; wartość nadajesz raz
pole	          ponowne przypisanie; musi dostać wartość w deklaracji albo w każdym konstruktorze
static final pole to stała, nazwa wielkimi literami: static final double VAT = 0.23;
metoda	          nadpisanie w klasie dziedziczącej
klasa	          dziedziczenie; np. String jest final

final int[] t = {1, 2};
t[0] = 9;          // OK: zmienia obiekt, na który wskazuje t
t = new int[3];    // BŁĄD: próbujesz przestawić referencję t

final blokuje zmienną (jej referencję), a nie obiekt, na który ona wskazuje. Tak samo final Student s pozwala zmienić 
pola studenta, ale nie pozwala, żeby s wskazywało na innego studenta.

Po co final: kod jest czytelniejszy, bo od razu widać, co się nie zmienia. Kompilator łapie przypadkowe nadpisanie. 
final jest też podstawą obiektów niemutowalnych, takich jak String.

Cannot assign a value to final variable 'number'
czyli „nie można przypisać wartości do zmiennej final o nazwie number”. bo to pole zostało już zainicjalizowane wcześniej
a żadna metoda nie pozwoli na zmianę pola final.

//t = new int[3]; w tym przypadku pojawi sie ten sam błąd ale wskarze na zmienna t bo tutaj chcemy wskazać na 
inna referncję na co final też nie pozwala