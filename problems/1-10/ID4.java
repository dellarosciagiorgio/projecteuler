// A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
// Find the largest palindrome made from the product of two 3-digit numbers.

public class ID4 {
    private static int reverse (int n) {
        String str = Integer.toString(n);
        var rev = new StringBuilder();
        str = rev.append(str).reverse().toString();
        return Integer.parseInt(str);
    }

    public static void main (String[] args) {
        int p = 0;
        for (int a = 999; a > 0; --a) {
            for (int b = 999; b > 0; --b) {
                int mul = a * b;
                if ((reverse(mul) == mul) && (mul > p)) {
                    p = mul;
                }
            }
        }
        System.out.println("the largest palindrome made from the product of two 3-digit numbers is: " + p);
    }
}