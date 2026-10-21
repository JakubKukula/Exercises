String a = "Java";
String b = "Java";
Obie zmienne wskazują na ten sam obiekt w String pool na stercie
String c = new String("Java");
c wskazuje na inny obiekt poza pulą String pool na stercie
StringBuilder sb = newStringBuilder("abc");
sb wskazuje na jeden obiekt na stercie, zmienny w miejscu 
a,b,c jeżeli chcemy zmienić wartość to java tworzy za każdym razem nowy obiekt

String
jest nie zmienny każda zmiana tworzy nowy obiekt
s.toUpperCase(); bez przypisania nie zmienia obiektu s 
equals porównuje treść
pętla += 1000x za każdym razem tworzy nowy obiekt 

Metody String !!!
length() - zwraca długośc zmiennej
charAt(i) - zwraca znak na danym indexie
substring(od,do) - zwraca odcinek tekstu od np. a.substring(1,3) = av 3 indexu nie zwraca
indexOf() - zwraca index danego elementu
toUpperCase/toLowerCase - (zwracają nowy String) zmieniają text na duże/małe litery. przeba przypisać !!!
equals - porównuje treści zmiennych
compareTo - zwraca wartośc zależną od wartości podanych liter
concat - skleja dwa Stringi czyli robi to samo co + 

StringBuilder
jest zmienny (append) zmienia ten sam obiekt
equals nie poruwnuje treści (dziedziczy z Object)
pętla += 1000x 1 obiekt

Metody StringBuilder
append - dodaje do treści nowy tą treść
reverse - odwraca treść
toString - tworzy obiekt String a po dodaniu do sb nowej terści nie zmienia Stringa
przydatne też to porównia treści
println(sb) samo nadpisuje toString z klasy Object żeby wyświetlić abc a nie adres
