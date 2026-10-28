System.out.println(-7 / 0.0);   // -Infinity
System.out.println(7 % 0);      // ArithmeticException
System.out.println(0.0 / 0);    // NaN

Diploma.findBestAverage(List<Diploma> diplomas) statyczna nie dodtyka żandego pola 
Diploma.getAverage() instancyjna dotyka pola np. price

int k = 5;
do {
k--;
} while (k > 5);
System.out.println(k);                  // obrotów: 1   wypisze: 5

for (int x = 0; x < 10; x += 4) {
System.out.println(x);              
}
// obrotów: 1  wypisze: 0
            2           4
            3           8