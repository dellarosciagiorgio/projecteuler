// 145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.
// Find the sum of all numbers which are equal to the sum of the factorial of their digits.
// Note: As 1! = 1 and 2! = 2 are not sums they are not included.

public class ID34 {
    public static int factorial (int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main (String[] args) {
        int sum = 0;
        for (int i = 3; i < 1000000; i++) {
            int digitsum = 0;
            int n = i;
            while (n > 0) {
                int digit = n % 10;
                digitsum += factorial(digit);
                n /= 10;
            }
            if (digitsum == i) {
                sum += i;
            }
        }
        System.out.println("the sum of all numbers which are equal to the sum of the factorial of their digits is: " + sum);
    }
}