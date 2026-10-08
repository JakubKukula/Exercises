NumberFormatException - to błąd (wyjątek) w języku Java, który występuje wtedy, gdy program próbuje przekształcić tekst 
(String) na liczbę, ale ten tekst nie ma odpowiedniego formatu numerycznego.

InputMismatchException - wprowadzony tekst nie pasuje typem , albo jest poza zakresem danego typu danych

while (!scanner.hasNextInt()){
    System.out.println("This is not number, try again");
    scanner.next();
}
po usunięciu scanner.next() program nie przestanie powtarzać pętli bo nic go nie zatrzyma.
next() usuwa abc z bufora. Dopiero wtedy hasNextInt() czeka na nowe dane z klawiatury.


scanner.close();

Scanner scanner1 = new Scanner(System.in);
String x = scanner1.nextLine();

jeżeli po zamknięciu scannera ponownie byśmy chcieli go użyć nawet tworząc nowy to wyświetli się błąd 
NoSuchElementException - zamknięcie Scanner  powoduje automatyczne zamknięcie samego strumienia System.in. 
Raz zamkniętego strumienia wejściowego nie da się ponownie otworzyć w trakcie działania tej samej aplikacji.

porównywanie dwóch obiektów klasy Person za pomocą equals:
bez napisania equals działa jak == poruwnuje referencje a nie znaki