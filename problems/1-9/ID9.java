// A Pythagorean triplet is a set of three natural numbers, a < b < c, for which, a^{2}+b^{2}=c^{2}
// For example, 3^{2}+4^{2}=9+16=25=5^{2}.
// There exists exactly one Pythagorean triplet for which a+b+c=1000.
// Find the product abc.

public class ID9 {
    public static void main (String[] args) {
        int prod = 0, max = 1000;
        for (int a = 1; a <= max; ++a) {
            for (int b = 2; b <= max; ++b) {
                for (int c = 3; c <= max; ++c) {
                    if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) && a + b + c == max) {
                        prod = a * b * c;
                    }
                }
            }
        }
        System.out.println("the product of a Pythagorean triplet for which a+b+c=1000 is: " + prod);
    }
}