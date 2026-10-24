F1.
System.out.println((double) 0 / 0);   // NaN
System.out.println(3 / 0.0);          // Infinity
System.out.println(-3.0 / 0);         // -Infinyty
System.out.println(0 / 0);            // ArithmeticException

F2.
Grade.getGradeValue() instancja dotyka pola GradeValue
Client.findTopAddonSpender(List<Client> clients) static przechodzi po liście wykorzystując metode sumAddon
Trip.addClient(Client client) może być static bo nie dotyka żadnego pola klasy tylko dodaje obiekt do listy
GradeValue.getValue() instancja zwraca poleValue obiektu

F3.
int i = 0;
do {
i += 3;
} while (i < 10);
System.out.println(i);      
// obrotów: ?   wypisze: ?
            1           3
            2           6
            3           9
            4 koniec pętli 12
int j = 10;
while (j < 10) {
j += 3;
}
System.out.println(j);      
// obrotów: 0   wypisze: 10

F4.
System.out.println("2024-10-24".matches("\\d{4}-\\d{2}-\\d{2}"));       // true
System.out.println(Pattern.compile("\\d+").matcher("a12b3").find());    // true
Matcher m = Pattern.compile("\\d+").matcher("a12b3");
int c = 0;
while (m.find()) c++;
System.out.println(c);                                                  // 2