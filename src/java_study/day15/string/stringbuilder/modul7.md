M1.
String a = "Java";
String b = "Java";
String c = new String("Java");
a == b        // true - wskazują ten sam obiekt
a == c        // false - wskazują inny obiekt
a.equals(c)   // true - treści są takie same

M2.
String s = "kot";
s.toUpperCase(); - nie zmienia s
s.concat("ek"); - nie zmienia s 
System.out.println(s); kot

M3.
String s = "programowanie";
s.substring(3, 7)      // gram
s.indexOf('o')         // 2
s.charAt(s.length())   // StringIndexOutOfBoundsException bo ostatni index to length()-1 a charAt
zwraca znak z podanego indexu

M4.
StringBuilder sb = new StringBuilder("abc");
sb.append("d").reverse(); jest mutowalny
System.out.println(sb); dcba 

StringBuilder sb2 = sb;
sb2.append("!");
System.out.println(sb); dcba! 

M5.
StringBuilder x = new StringBuilder("hej");
StringBuilder y = new StringBuilder("hej");
System.out.println(x.equals(y)); - złe porównanie
System.out.println(x.toString().equals(y.toString())); dobre porównanie

M6.
String result = "";
for (int i = 0; i < 1000; i++) {
result += i;
}

powstanie 1000 obiektów a w String boulder 1 ale w tym praypadku czas operacyjny wykoniania sie
pętli będzie nie zaważalny dopiero przy bardzo dużych liczbach obrotu pętli bedzie to zauważalne

