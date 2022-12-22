// By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
// What is the 10 001st prime number?

public class ID7 {
    public static boolean isPrime (int x) {
        for (int i = 2; i < x; ++i) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args) {
        int c = 0, x;
        for (x = 2; c != 10001; ++x) {
            boolean prime = isPrime(x);
            if (prime) {
                ++c;
            }
        }
        System.out.println("the 10 001st prime number is: " + (x - 1));
    }
}