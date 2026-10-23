F1.
System.out.println(0 / 0.0);    // NaN
System.out.println(5 / 0.0);    // Infinity
System.out.println(-5 / 0.0);   // -Infinity
System.out.println(5 % 0);      // ArithmeticException

F2.
Diploma.getAverage() - ta metoda używa pola np. ceny danego obiektu, sumuje je i dzieli przez ich ilość
Order.cheapestWithStatus(Status status) (z wejściówki #3, ta z static extent) - przechodząc po liście porównuje 
status z polem obkiektu na którym jest określony status 
Song.getSeconds() - zwraca pole obiektu które przechowuje wartość (długośc piosenki w sekundach)
Team.bestAttack(List<Team> teams) - na nie dotyka żadnego pola przechodzi poliście teamów i sprawdza która ma najwiecej 
goli

F3.
for (int i = 20; i >= 5; i -= 5) { ... }   
wartości i:    obrotów: 
    20              1
    15              2
    10              3
    5               4
    0 koniec. robi 4 obroty

int k = 10;
do {
k++;
} while (k < 5);
System.out.println(k);                     
// obrotów: 0   wypisze: 11

F4.
String x = "ab";
String y = x + "c";
System.out.println(y == "abc");        // false
System.out.println(y.equals("abc"));   // true
        