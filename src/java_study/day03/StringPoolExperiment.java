package java_study.day03;

public class StringPoolExperiment {
    public static void main(String[] args) {

        String a = "hej";
        String b = "hej";
        String c = new String("hej");
        String d = c;
        System.out.println(a == b); // true
        System.out.println(a == c); // false
        System.out.println(c == d); // true
        System.out.println(a.equals(c)); // true


        String x = "ja" + "va";
        String y = "java";
        System.out.println(x == y); // true


        final String p = "ja";
        String q = p + "va";
        System.out.println(q == "java"); // true
        System.out.println(q.equals("java")); // true


        String s = null;
        System.out.println("abc".equals(s)); // false
        System.out.println(s.equals("abc")); // nullPointerException
    }
}
