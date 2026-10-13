Zadanie 2 (logika). Co wypisze? Rozpisz w tabeli.

List<Integer> nums = new ArrayList<>(List.of(4, 7, 2, 9));
int result = 0; deklaracja + inicjalizacja
for (int n : nums) { pętla for iteruje po liście nums. n to dana liczba z listy odpowiadająca iteracji
    if (n % 2 == 0) { warunek spartwdza czy n jest liczbą parzystą
    result += n; jeżeli tak dodaje n do result
    } else {
    result -= 1; jeżeli nie odejmuje od result 1
    }
}
System.out.println(result); wypisuje wynik: 4

Zadanie 3 (teoria). Czym różni się tablica int[] od ArrayList<Integer>? Podaj co najmniej dwie różnice.
1. tablica ma określoną długość i nie można jej zmienić a lista rozciąga sie lub kurczy wraz z dodaniel elementu lub usunięciem
2. nie wiem