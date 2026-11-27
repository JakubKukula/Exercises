package java_study.day24.uml.md;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        /*
        A. Przetłumacz na UML (jedna linijka każde):
┌───────────────────────────────┐
│              Car              │
├───────────────────────────────┤
│ - uniqueNumber: int {readOnly}│
│ # name: String                │
│ - count: int       (podkreśl.)│
├───────────────────────────────┤
│ + dailyCost():double{abstract}│
│ + getAccountCount(): int (podkreśl.)│
  + addStudent(Student student) : boolean
└───────────────────────────────┘

B. Przetłumacz na Javę:
6. - maxStudent: int {readOnly} - private final int maxStudent;
7. + coursesPrice(): double - public double coursesPrice()
8. - nickname: String [0..1] - private String nickname;
9. - / total: double - private double total;

C. Czytanie liczności. Teacher 1 ───── 1..* Lesson
10. Czy lekcja może nie mieć nauczyciela? nie. lekcja musi mieć jednego nauczyciela
11. Czy nauczyciel może nie mieć żadnej lekcji? nie. nauczyciel musi mieć conajmniej jedną lekcję
12. Jakie pole będzie w Teacher, a jakie w Lesson? w teacher bedzie lista lekcji a do lekcji będzie przypisany jeden nauczyciel

D. Agregacja, kompozycja czy zwykła asocjacja? Uzasadnij jednym zdaniem:
13. Book – Chapter kompozycja rozdział nie istneje bez ksiązki
14. Fleet – Car zależy ale agregacja bo auto może istnieć bez floty
15. Student – Course może być wszystko zależy od połączenia ale mu można dać asocjację student ma wiele kursów i nawzajem
16. Invoice – InvoiceLine (pozycja na fakturze) komnpozycja pozycja na fakturze nie istnieje bez faktury

E. Narysuj diagramy dla swojego kodu:
17. Szkoła językowa: Languages, Course, Student, School z licznościami.
18. Schronisko: Animal i podklasy oraz Shelter.
wyślę screen

Próbny mini-test

// 1
System.out.println(7 / 2 + 7 % 2 + 7 / 2.0); - 7.5

// 2
System.out.println("Java".substring(1).toUpperCase() + "abc".indexOf('c')); - AVA2

// 3
String s = null;
System.out.println("tak".equals(s)); - NullPointerExeption

// 4
List<Integer> l = new ArrayList<>(List.of(4, 5, 6));
l.remove(Integer.valueOf(4));
l.remove(0);
System.out.println(l); - 6

// 5
Set<String> set = new TreeSet<>(List.of("b", "A", "a"));
System.out.println(set); - albo wyjątek alebo sie nie skompiluje bo w nawiasach powinno być set.of

// 6
Map<String, Integer> m = new HashMap<>();
m.put("x", 1);
System.out.println(m.put("x", m.get("x") + 1)); 1
System.out.println(m.get("x")); 2

// 7 (podaj też liczbę obrotów)
int i = 10;
do {
    i += 5;
} while (i < 10);
System.out.println(i); 15 obrót: 1

// 8 (Twoje klasy ze schroniska)
Animal a = new Cat("Mruczek", 3);
System.out.println(a.dailyCost()); - 8.0

// 9 (Twój enum Fuel: PETROL, DIESEL, ELECTRIC)
System.out.println(Fuel.valueOf("ELECTRIC").ordinal()); - ELECTRIC 0.20

// 10
StringBuilder sb = new StringBuilder("abc");
sb.reverse().append("!");
System.out.println(sb); - cba!

// 11
System.out.println(Integer.parseInt("+42") + 1); - 43

// 12
System.out.println(0 / 0.0); NaN

Część B: teoria, krótko (10 min)
Kiedy metoda może być static? Podaj regułę jednym zdaniem. - kiedy pole jest static albo nie dotyka zadnego pola klasy
Kontrakt equals/hashCode: oba zdania. chodzi o to że hashCode najpierw musi odnaleśc odpowiedną szufladę a potem equals
porównać wartości
Dlaczego getter listy w klasie zwraca new ArrayList<>(...), a nie samo pole? żeby nikt nie mógł wyciścić list. jeżeli kotś
wyczyści kopię główna lista sie nie zmieni
Co się stanie w relacji dwustronnej bez sprawdzenia contains? Podaj nazwę błędu. StuckOferflow metody będą sie wywoływac
nawzajem
Kiedy metoda powinna rzucić wyjątek, a kiedy zwrócić false?wyjątek kiedy wpisywanę są bzdurna dane a false kiedy coś nie
zostało wykonane
Kiedy klasa powinna być abstrakcyjna? Czy można napisać new na klasie abstrakcyjnej? powinna być abstarkcujna gdy bedzimy
chcieli tworzyć na inne podklasy np zwierzęta i nie pisac za kazdym razem tych samych pól. nie można
Na diagramie UML: co znaczy - / total: double? A co Order * ────── 1 Client (ile klientów ma zamówienie, ile zamówień ma klient)?
pole prywatne coś jak counter. klient może mieć wiele zamówien a zamówienie jest przypisane do jednego klienta

         */
    }
}
