Tablica to obiekt na stercie:

int[] t = new int[3];          // 3 miejsca, wypełnione wartościami domyślnymi
int[] u = {5, 8, 2};           // od razu z wartościami
STOS              STERTA
t ──────────►  [ 0 | 0 | 0 ]
0   1   2     ← indeksy: od 0 do length - 1

tablica tak samo jak i pola ma swoje wartości domyślne odpowiadające zadeklarowanemu typowi
int,long -> 0
double -> 0.0
boolean -> false
String i inne obiekty -> null

Tablia tak samo jak String przechowuje referencje
int[] a = {1, 2, 3};
int[] b = a;          // b wskazuje TĘ SAMĄ tablicę
b[0] = 99;            // a[0] też jest teraz 99

Pytania 
1. 0500 dlaczego tablica t ma długośc 4 czyli 3 indexy t[1] = 5 inicjalizuje wartośc na indexie 1
2. program wyrzuci błąd nullpointerexeption ponieważ String jako podstawowa wartośc posiada null a sout chce wypisać
długośc pierwszego elementu w tablcy który nie istnieje.
3. 10 true ponieważ a i b wskazują na ten sam obiekt a tablice są mutowalne i zmaian wartości w jednej zmiennej 
zmienia wartości dla wszystkich referencji
4. false - x i y wskazują na inny obiekt jeżeli robimy taki zapis int[] x = {1,2} to za każdym razem tworzymy
nowy obiekt nawet jak dwie tablice mają takie same wartości 
false - nie poruwnuje sie w taki sposób wartości tablic 
true - bo to porównuje wartości tablic 
5. 1,2,3 ta pętla nic nie zmienia w tablicy tytaj wogóle jest namieszane bo for tworzy kopię v sie mnoże przez 2
poczym jest nowa wartośc w następnej iterancji
6. to zmienna t jako tablica przechowuje adres (referencję) obiektu więc sout wypiszę tą referencję
7. 2 = liczba wierszy 3 = liczba kolumn 3 = pierwszy wiersz index 2
8. 
int[] t = {3, 8, 1, 6}; tablica o długości 4
int max = t[0]; max = 3 bo index 0 to pierwszy element
for (int i = 1; i < t.length; i++) { pętla zaczyna się od drugiego elementu to pierszy jest już wykorzystany 
jako liczba do które inne będą sie odnosić, warunek zapisany poprawnie jak i inkrementacja
   if (t[i] > max) { warunek jeżeli dany element tablicy jest większy od naszej zmiennje max kótra wynosi 3 to 
napisujemy zmienna max większą warością
   max = t[i]; napisanie zmiennej max
   }
}
System.out.println(max); wypisanie zmiennej, największej wartości z tablicy t

Przy braku walidacji metody countEven i wywołaniu null program wyrzuca błąd: 
Exception in thread "main" java.lang.NullPointerException: Cannot read the array length because "<local2>" is null
at java_study.day06.ArrayPractice.countEven(ArrayPractice.java:58)
at java_study.day06.Main.main(Main.java:44)