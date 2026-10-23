# Budżet domowy – projekt v1.0

## 1. Kwota: double czy int w groszach?
Wybór: double
Dlaczego: różnice w dodawaniu nawet 0.1 + 0.2 bedą w życiu codziennym nie zauważalne
Koszt tego wyboru: nie zauważalny
(Pomocniczo: co wypisze System.out.println(0.1 + 0.2); 0.30000000000000004)

## 2. Przychód vs wydatek
Opcja A: enum TransactionType { INCOME, EXPENSE } i zawsze dodatnia kwota
Opcja B: kwota ujemna = wydatek
Wybór: A. i będą tam metody abstrakcyjne i przy wyborze np. co miecąc przydodu bedzie dodawana kwota do balansu domowego
przy wydadkach będzie analogocznie odelmowana 
Jak wygląda „suma wydatków” w mojej wersji: chcę zapisywać osobne wydadki do np. fille żeby wiedzeć na co poszło ale 
i ile co kosztowało i ale też widzieć aktalnie ile kasy w danym miesiacu zostało wydane 
Jak wygląda walidacja kwoty w mojej wersji: prosta kwota nie może być mniejsz od
(Opcjonalnie: czy TransactionType może mieć metodę abstrakcyjną applyTo(balance, amount)?)

## 3. Relacja Account – Transaction
Czy Transaction musi wiedzieć, do którego konta należy? bedzie jedno konto na budzet domowy
Uzasadnienie (reguła strzałki: kto o kogo pyta?): amout nie muszi wiedzieć która kranzakcia co robiła chociaż można by 
było to zapisywać że np 12.02.2024 została dokonana wpłana na kwotę 1000zł ale to można też notoważ w fille history z 
wydadkami 

## 4. Jedno konto czy kilka?
Wybór: jedno wspólne konto domowe
Jeśli kilka – gdzie jest lista kont (nauczyciel: listy w main)? ?

## 5. Data w przyszłości
Pozwalam / wyjątek: może pokazywać czy planować wydadki w krótce
Dlaczego: bo czasami będzie cos zaplanowane do przodu

## 6. Zakres dat from–to
Czy oba końce się liczą? tak zakres jest od 01 do 31 włącznie 
Co gdy from > to? ?
Przykład: wydatek z 31.10, zakres 1.10–31.10 → liczy się? tak

## 7. Średni wydatek dzienny
Dzielę przez: liczbę dni w zakresie / liczbę dni z wydatkami? to jest nie potzrebne raczej będzie można pokazywać wydadki
z danego miesiąca nie potzreba informancji ile wydało sie średnio codziennie 
Ile dni ma zakres 1.10–1.10? ?
Co zwracam, gdy nie ma żadnych wydatków? (pamiętaj o NaN) ?

## 8. Static czy instancyjna (reguła: czy używa pól this?)
| Metoda                                   | Werdykt  | Jakie pole this?     |
|------------------------------------------|----------|----------------------|
| dodanie transakcji                       | instancja | balance              |
| saldo konta                              | instancja | balance              |
| suma wydatków w kategorii                | instancja | lista ale nie static |
| suma wydatków w zakresie dat             |          | ?                    |
| kategoria z największymi wydatkami       | ?        | ?                    |
| średni wydatek dzienny                   | ?        | ?                    |
| największy pojedynczy wydatek            | ?        | ?                    |
| raport miesiąca (tekst)                  | ?        | ?                    |
chyba żeby jako jakiś wydatek czy wpłate robić jako osobny obiekt który bedzie dodawany do klasy HomeholeBudget??
## 9. Diagram (ASCII)
Klasy z polami i typami, liczności, kierunek strzałki, metody (static oznacz).
najpierw dojdzmy do jakiś konkretnych ustaleń
