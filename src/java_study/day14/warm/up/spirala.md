S1.
NaN x  -> Infinity v
wyjatek- ArithmeticException

S2.
B66 - a97 = -31 B jest przed a

S3.
static int p(int n) { return q(n * 2) - 1; }
static int q(int n) { return n + 4; }
// main: System.out.println(p(3));
main            metoda                      n       return      
wywołanie p     przekazyje do q n*2 = 6     6
wywołanie q     6 + 4                       10        10   -> metoda q sie zamyka
wracamy do p    10 - 1                      9         sout(9)  -> metoda p sie zamyka

S4.
kiedy metoda nie dotyka żadnego obiektu
lepiej (Metoda jest static, gdy nie używa pól ani metod tego obiektu (this))

S5.
średniodużo 
samo średnio bo -> wskazuje na jeden wynik i nie przechodzi dalej nawet bez break

S6.
a) warunek zwróci false i blok sie nie wykona
b) java wyrzuci wyjątek bo warunek próbuje zwrócić długośc czegoś co nie istnieje

S7.
99 1
tablica jest mutowalna i zmieniamy konkretny element w tablicy a x = 99 w metodzie znika po jej zamknięciu
i x zostaje bez zmain

S8.
for (int i = 1; i <= 10; i += 3) { ... }
1
4
7
10
13 warunek false pętla sie zamyka przed wykonianiem bloku kodu dla warunku true
pętla wykona sie 5 razy (4)!




