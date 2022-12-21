public class functions {
    private static int reverse (int n) {
        String str = Integer.toString(n);
        var rev = new StringBuilder();
        str = rev.append(str).reverse().toString();
        return Integer.parseInt(str);
    }

    public static boolean isPrime (int x) {
        for (int i = 2; i < x; ++i) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int factorial (int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static boolean isPalindrom (String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static void main (String[] args) {
        int i = 0;
        String s = null;
        reverse(i);
        isPrime(i);
        factorial(i);
        isPalindrom(s);
    }
}