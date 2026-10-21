R1.
System.out.println(0.0 / 0); Infinity
System.out.println(-5.0 / 0);   Infinity
System.out.println(5 / 0);  ArithmeticException
R2.
// A
switch (x) {  x = 2
case 1: System.out.print("jeden "); 
case 2: System.out.print("dwa ");
case 3: System.out.print("trzy ");
dwa trzy
}
// B
switch (x) {
case 1 -> System.out.print("jeden ");
case 2 -> System.out.print("dwa ");
case 3 -> System.out.print("trzy ");
dwa
}
R3.
for (int i = 10; i > 0; i -= 4) { ... }
i       warunek     i-=4    iteracja
10       true        6          1
6        true        2          2
2        false = ta iteracja sie nie wykona 
pętla wykona sie 2 razy
R4.
static - jedna kopia, można uruchomić bez obiektu, nie dotyka zadnego pola obiektu
Diploma.getAverage() - static bo metoda jest wywoływana na klasie
Diploma.findBestAverage(List<Diploma>) - tak samo to
Client.addonsCost() - tak samo to
R5.
79 - 111 = -32 / O jest przed o

// 10 min
