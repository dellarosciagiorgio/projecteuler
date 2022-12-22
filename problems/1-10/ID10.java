// The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
// Find the sum of all the primes below two million.

public class ID10 {
    public static boolean isPrime (long x) {
        for (long i = 3L; i <= Math.sqrt(x); ++i) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args) {
        long sum = 2L;
        for (long i = 3L; i < 2000000; i += 2) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        System.out.println("the sum of all the primes below two million is: " + sum);
    }
}