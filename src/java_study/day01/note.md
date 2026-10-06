java: non-static variable name cannot be referenced from a static context
Kiedy w metodzie statycznej piszesz po prostu name, kompilator czyta to jako this.name. 
Pyta więc: czyje name? Obiektu nie ma, więc nie ma this, więc dostajesz błąd.


java: illegal start of expression
To błąd składni, a nie logiki. sam błąd znaczy że java oczekiwała w tym miejscu wyrażenia albo instrukcji, a dostała
token od którego żadne wyrażenie nie może się zaczynać
