1.Czym różni się [abc] od abc? Pokaż przykład tekstu, który pasuje do jednego, a do drugiego nie.
do [abc] pasuje a,b,c a do abc nie 

2.Dlaczego "\\d+" ma dwa backslashe? Kto „zjada” pierwszy?
pierwszy backslashe znaja String bo w java \ też jest znakiem specjalnym

3.Napisz wzorzec dla daty dd.mm.rrrr i podaj jeden tekst, który przejdzie wzorzec, choć nie jest prawdziwą datą.
System.out.println("40.56.1495".matches("\\d{2}\\.\\d{2}\\.\\d{4}"));

4.Masz tekst "x1y22z333". Ile razy wykona się while (m.find()) dla \d, a ile dla \d+? 
dla \d wykona sie 6 a dla \\d+ 3

5.Kiedy wybierzesz String.matches, a kiedy Pattern + Matcher?
String.matches- kiedy chę porownać jeden konkretny tekst
Pattern + Matcher kiedy bedzie wieloktotnie używany 

