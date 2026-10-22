F1.
System.out.println(0.0 / 0);    // NaN
System.out.println(7.0 / 0);    // Infinity
System.out.println(-7.0 / 0);   // -Infinity
System.out.println(7 / 0);      // ArithmeticException

F2.
Trip.sumAddons() nie statyczna bo metoda będzie musiała z kąś wziaść te dodadki najpewniej z pola klasy jakiejś listy
Client.findTopTotalSpender(List<Client> clients) metoda statyczna poniaż jako arument ma listę obiektów na których bedzie
najpewniej wykonywana metoda sumSpendMoney i to będzie porównychać 
Playlist.totalSeconds() metoda nie statyczna ponieważ będzie musuala dotknąc pola secunds każdego obiektu z listy
sumująca je zwracając ich sume  
Playlist.longest(List<Playlist> playlists) metoda statyczna nie dotyka żadnego pola obiektu tylko zwraca długośc playListy
czyli listę klasy

F3.
for (int i = 0; i < 10; i += 3) { ... }    
wartości i: 0   obrotów: 1
            3            2
            6            3
            9            4
            12    koniec
4 obroty

int n = 5;
while (n > 0) { n -= 2; }                  
obrotów: 3   n po pętli: -1

F4.
String s = "Java";
s.toLowerCase(); s jest nie nadpisane więc s zostaje bez zmian
System.out.println(s.equals("java"));   // false



               