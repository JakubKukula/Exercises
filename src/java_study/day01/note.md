java: non-static variable name cannot be referenced from a static context
Kiedy w metodzie statycznej piszesz po prostu name, kompilator czyta to jako this.name. 
Pyta więc: czyje name? Obiektu nie ma, więc nie ma this, więc dostajesz błąd.


java: illegal start of expression
To błąd składni, a nie logiki. Parser dotarł do miejsca, w którym ten token nie ma prawa się pojawić.
Komunikat jest ogólnikowy, a prawdziwa przyczyna leży zwykle linię lub kilka linii wyżej niż wskazany numer.
