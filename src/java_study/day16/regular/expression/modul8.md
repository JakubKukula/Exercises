Regex to wzorzec do którego dopasowujesz text

tekst: "abc123x"     wzorzec: \d+

matches()  → czy CAŁY tekst pasuje do wzorca?        "abc123x" ≠ same cyfry → false
find()     → czy GDZIEŚ w tekście jest fragment?      znajduje "123"         → true

W java jak chcemy żeby do regexa trafiła konkretny znak piszemy np.(\\! - ma być konkretnie wykrzyknik) i analogicznie
wszyskie tego typu przypadki tak samo : \\d, \\., \\w.

M1: matches sprawdza CAŁY tekst
System.out.println("abc123".matches("[a-z]+\\d+"));    // true
System.out.println("abc123x".matches("[a-z]+\\d+"));   // false bo po liczbach jest x a maches tego nie uwzglednia

M2: matches vs find
System.out.println(Pattern.compile("\\d+").matcher("abc123x").matches());   // false matches wymaga samych lidzb 1 lub więcej
System.out.println(Pattern.compile("\\d+").matcher("abc123x").find());      // true szuka czy znajdują sie jakieś liczby

M3: find w pętli (ile razy znajdzie?)
Matcher m = Pattern.compile("\\d+").matcher("a1bb22ccc333");
int count = 0;
while (m.find()) {
count++;
}
System.out.println(count);   // 3 bo znajduje 1 potem 22 i potem 333

M4: kropka bez escapowania (pułapka z Twojej daty w Dyplomie!)
System.out.println("12.10.2024".matches("\\d{2}.\\d{2}.\\d{4}"));     // true . jako dowolny znak 
System.out.println("12a10b2024".matches("\\d{2}.\\d{2}.\\d{4}"));     // true . jako dodowlu znak 
System.out.println("12a10b2024".matches("\\d{2}\\.\\d{2}\\.\\d{4}")); // false tutaj . jako konkretny znak

M5: kwantyfikatory
System.out.println("".matches("a*"));            // true bo a może być ale nie musi 
System.out.println("".matches("a+"));            // false bo a musi być chociaż raz
System.out.println("color".matches("colou?r"));  // true bo u może być ale nie musi
System.out.println("colouur".matches("colou?r"));// false bo u może być 0 albo max 1 razy 

M6.
String postal = "\\d{2}-\\d{3}";   // Twój wzorzec
System.out.println("00-950".matches(postal));   // true
System.out.println("00950".matches(postal));    // false
System.out.println("0-950".matches(postal));    // false
System.out.println("00-95a".matches(postal));   // false

