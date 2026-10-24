JOptionPane - to gotowa klasa która wyświetla okno dialogowe: komunikat, pytanie o tekst albo pytanie tak lub nie
wszystkie jej metody są statyczne.

Przykład JOp
JOptionPane.showMessageDialog(null, "Zła kwota", "Błąd", JOptionPane.ERROR_MESSAGE);
                            rodzic      treść     tytuł         ikona

rodzic - oznacza gdzie pojawi sie okno null = pośrodku
Zwraca void. Program czaka aż użytkownik klikcie ok

YES_OPTION	0	kliknął Tak
NO_OPTION	1	kliknął Nie
CANCEL_OPTION	2	kliknął Anuluj (gdy jest YES_NO_CANCEL_OPTION)
CLOSED_OPTION	-1	zamknął okno X
OK_OPTION	0	to samo co YES_OPTION

Zawsze porównuj ze stałą, a nie z liczbą: if (choice == JOptionPane.YES_OPTION)

Jop zawsze zwraca String przez co jeżeli chce sie otzrymać liczbę trzeba samemu ją konwertować na pomocą parseInt
lub parseDuble
dla null oba wybychają ale zwracają inne wyjątki przy int NumberFormatExeption, a przy double NullPointerExaption

bezpieczna konwersja:
answer == null?
answer.isBlank()?
!answer.matcher(wzorzec)?
parseInt(answer)

można fajnie wykorzystać z pętlą do-while

pułapki brak walidacji null = wyjątek
"25" traktowane jako liczba "25" + 1 = "251" sklejanie tekstu
spacja przed parseInt " 12" = wyjatek !!! trim przed parsowaniem

B.
String s = JOptionPane.showInputDialog("Podaj liczbę:");
if (s == null) {
    System.out.println("A");
} else if (s.matches("\\d+")) {
    System.out.println("B " + (Integer.parseInt(s) * 2));
} else {
    System.out.println("C");
}

1. B 42
2. NumberFormatExeption
3. C albo null jeżeli poste pole traktujemy jako brak czegokolwiek
4. C
5. B -10

Część 5: mini-sprawdzian 
Jakie trzy różne wartości może zwrócić showInputDialog i kiedy?
0 dla OK i YES, 1 dla NO, 2 dla CANCEL, -1dla CLOSED 
Co zwraca showConfirmDialog po zamknięciu okna X? Dlaczego to ważne?
-1 żeby np przy pętli nie wykonały sie dalsze bloki kodu
Dlaczego "tak".equals(answer) jest bezpieczniejsze niż answer.equals("tak")?
bo "tak".equals(answer) bo metoda wywoła stały tekst a nie zmienna
Wymień dwie różnice między Integer.parseInt a Double.parseDouble przy nietypowym wejściu.
int nie usuwa spacji i wyrzyca wyjątek i przy nul wyrzucą inne wyjątki
Dlaczego pętla „pytaj do skutku” to naturalne miejsce na do-while, a nie while?
bo while wykona pewna część kody np sprawdzając zanna zmenną i ją walidując a while odrazy sprawdza warunek 
pętli i potem można dopiero przechodzić do strawdzenwia np. walidacji itp.

