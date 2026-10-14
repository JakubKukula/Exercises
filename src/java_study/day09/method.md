public   static   int      add   (int a, int b)   { return a + b; }
// ▲        ▲       ▲        ▲          ▲              ▲
// dostęp   klasa/  typ      nazwa   PARAMETRY        ciało
//          obiekt  zwracany

Przeciążanie (overloading)
Ta sama nazwa, inna lista parametrów (liczba, typy albo kolejność):

static int add(int a, int b)          { ... }
static double add(double a, double b) { ... }   // OK: inne typy
static int add(int a, int b, int c)   { ... }   // OK: inna liczba
static double add(int a, int b)       { ... }   // BŁĄD: różni się tylko typem zwracanym

Pytania
1. nie skompiluje sie ponieważ nie ma elsa czyli naszego co ma się stać gdy wszystkie if czy jeden da false
1 poprawa
static String grade(int points) {
    if (points >= 50) {
        return "zaliczone";
    } else  {
        return "niezaliczone";
    }
}
2 poprawa
static String grade(int points) {
    return points >= 50 ? "zaliczone" : "niezaliczone";
}

2.
void show(int a) - int  show(int b) te dwie metody nie mogą istnieć bo różni sie tylko typ zwaracany
void show(int a, String s) - void show(String s, int a) tak samo to bo zmienia sie tylko kolejność parametrów

3.
int bo java sama wybierze pierwszą metode
double
int bo char A to liczba 65
przy ostatnim nie wiem

4.
static int a(int n) {
return b(n) + 1;
}
static int b(int n) {
return n * 2;
}
// w main:
System.out.println(a(3)); = 7 a czeka na działanie w zmiennej b i potem wykonuje resztę
b zwraca 6
a dostaje wynik i dodaje 1
main wypisuje 7
po return ramka znika

Krok	Stos (góra ↑)	    Co się dzieje	     Wartość
1	    main	            wywołuje a(4)	     —
2	    a(n=4) / main	    wywołuje b(4), czeka —
3	    b(n=4) / a / main	4 * 2	             b zwraca 8
4	    a(n=4) / main	    ramka b znika, 8 + 1 a zwraca 9
5	    main	            ramka a znika, println	9

5.sout = błąd dorosły dziecko

6.
parametr to konkretny typ i nazwa (String name), a argument to konkretna wartość("Jan")
nie da sie przeciązyć metody zmieniając tylko zwracany typ bo java dalej nie jaką metodę wybrać patrząc po argumentach

Drill przeciążenia
a) void f(int a, String s)   |  void f(String s, int a)  ok
b) void f(int a)             |  void f(int b)            błąd
c) void f(int a, int b)      |  void f(int b, int a)     błąd
d) int f(int a)              |  void f(long a)           ok   
e) void f(double a)          |  double f(double a)       błąd