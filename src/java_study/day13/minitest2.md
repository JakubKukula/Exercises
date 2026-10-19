godzina startu - 12.25
A.
A1.
"Zebra".compareTo("apple")   // wartość minusową bo Z jest przed a ale nie znam dokałdnych wartości
"kot".compareTo("koc")       // wartość dodatcią bo t jest po c

A2.
f('A'); // void f(int x) bo 'A' to wartośc bez przecinka
f(5L); // void f(long x) bo 5L bo liczba przypisana do long
f(3.0f); // void f(double x) chociać że f oznacza flow bo liczba przecinkowa wybierze double
f((byte) 1); // void f(int x) wybierze inta bo jest najbliżej jako następny typ

A3.
int s = 9;
int c = 2;
double a = s / c; // 4.0
double b = (double) s / c; //4.5
double z = 0.0 / 0; // nie dzieli sie przez 0 wyrzuci błąd albo 0.0
System.out.println(a + " " + b + " " + z); 4.0 4.5 0.0

A4.
static int f(int n) {
return g(n + 1) * 3;
}
static int g(int n) {
return n - 2;
}
// main:
System.out.println(f(4));
wywołujemy metode f z argiemntem n = 4
metoda f wywołuje metode g
metoda g zwraca 4 - 2 = 2 - > metoda g znika
metoda f przyjmuje 4(n+1) = 5 * 3
metoda f zwraca 15 - > metoda f znika

A5.
static void a() {
System.out.print("A1 ");
b();
System.out.print("A2 ");
}
static void b() {
System.out.print("B1 ");
if (true) return;
System.out.print("B2 ");
}
// main:
a();
System.out.print("M"); 
A1 
B1
A2
M

A6.
wariant a - jeżeli nie nadpisuje to contains zwróci false bo program będzie sprawdzał referencje a nie wartości
wariant b - zwróci true bo napisany equals i hascode sprawdza wartości a nie refernecje

A7.
spain.getClients() = anna
italy.getClients() = anna
anna.getTrips() = spain italy

B.
B1.
public static Product cheapest(List<Product> products, Category c) {
Product result = null;
for (Product p : products) {
if (p.getCategory() == c && (result == null || p.getPrice() < result.getPrice())) {
result = p;
}
}
return result;
}
// products: [Chleb 5 FOOD, Mleko 4 FOOD, Ser 4 FOOD, Pióro 3 OFFICE]
Ta linijka ze śladami zajmie za dużo czasu opiszę to słownie

Product = null;
pętla przechodzi po produktach z listy
warunek jeżlei produkt jest z danej kategori i result = null lub cena produktu jest niższa niż cena result
result zostanie nadpisane 
metoda zwraca result
Dla food zwróci Mleko bo ser ma tą samą eartość a nie niższą
Dla Office pióro
Dla innych null

B2.
Metody nigdy sie nie skończą a java po wielu wykonanych metodach wyrzuci błąd
warunek zawsze będzie false bo argumenty nie są dodawane do listy zanim jedna metoda wywoła drugą i tak przez 
cały czas, żeby to naprawić powinno sie najpierw dodać argument trip do listy trips a kopiero potem wywołać drugą
metodę i tak samo w addCielnt

C
C1.
pierwszy bład count inkrementuje sie przy każdej interacji a nie przy znaleźieniu pasującego produktu do kategorii
drugi bład nie ma walidacji dla count = 0

C2.
pierwszy bład w metodzie getProducts() = zwracana jest prawdziwa lista przez co można ją np wyczyścić 
powinno być return new ArrayList(products)<>;
drugi bład przy pustej liście wyrzyci bład bo result zwraca pierszy element. result powinno być null
trzeci bład zły warunek result napisuje sie gdy cena jest większa i równa a powinno być gdy jest większa
warunek powinien wyglądać tak if (p.getPrice() > result.getPrice())

D.
static Client findClientWithMostTrips(List<Client> clients) {
    if (clients == null) {
        throw new IllegalArgumentException("List cannot be null");
    }
    Client result = null;
    for (Client client : clients) {
        if (result == null || client.getTrips().size() > result.getTrips().size()) {
            result = client;
        }
    }
    return result;
}

E.
E1.
poniważ static final tworzy jedną kpie dla całej klasy jedna kopia dla wszystkich obiektów tej klasy
jest to zmienna o wartości zainicjalizowanej w polu klasy i nazwa zmiennej jest pisana dużymi literami

E2.
byte , short, int , long , double , flout
i dlaczego m('B') wybiera long poniważ B to char liczba przypisana do litery bez przecinka dlatego pierszą 
mozliwością jest m(long) 

E3.
ponieważ bez tego metoda będzie mogła działać w nieskończonośc. żaden warunek nie zobaczy że dany obiekt znajduje 
sie w liście i wywoła drugi i tak w kółko

E4.
metoda powninna być static jeżeli będzie miała sprawdzać np. wartości staycznej listy danej klasy 
wtedy bedzie można wywołać tą metode nawet bez tworzenia obiektu tak samo jak robi to JVM z main

E5.
static int f (int a), static double g (int b)
w takim przypadku java nie wie którą metodę wybrać poniewać argumenty są identyczne nawet jeżeli nazwa jest inna

koniec 13.15