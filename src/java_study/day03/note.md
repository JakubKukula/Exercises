NumberFormatException - to błąd (wyjątek) w języku Java, który występuje wtedy, gdy program próbuje przekształcić tekst 
(String) na liczbę, ale ten tekst nie ma odpowiedniego formatu numerycznego.

InputMismatchException - Oznacza on, że wprowadzony tekst nie pasuje typem do tego, czego program oczekiwał, albo jest 
poza zakresem danego typu danych

while (!scanner.hasNextInt()){
    System.out.println("This is not number, try again");
    scanner.next();
}
po usunięciu scanner.next() program nie przestanie powtarzać pętli bo nic go nie zatrzyma. next() zatrzyma program
po napisaniu textu bądz liczby do odcztuje wszystko do pierwszej spacji. czyli jeżeli napiszemy abc wyśiwtli się komunikat
że nie jest to liczba po czym next() zatrzyma pętle i zaczeka na następny wpis.


scanner.close();

Scanner scanner1 = new Scanner(System.in);
String x = scanner1.nextLine();

jeżeli po zamknięciu scannera ponownie byśmy chcieli go użyć nawet tworząc nowy to wyświetli się błąd 
NoSuchElementException - W języku Java zamknięcie Scanner owiniętego wokół standardowego wejścia (System.in) powoduje 
automatyczne zamknięcie samego strumienia System.in. Raz zamkniętego strumienia wejściowego nie da się ponownie 
otworzyć w trakcie działania tej samej aplikacji.