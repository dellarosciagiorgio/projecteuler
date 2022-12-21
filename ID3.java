// The prime factors of 13195 are 5, 7, 13 and 29.
// What is the largest prime factor of the number 600851475143?

public class ID3 {
    public static void main (String[] args) {
        long n = 600851475143L;	
        for (long x = 2; x < n; ++x) {
            if (n % x == 0) {
                n /= x;
                x = 2;
            }
        }
        System.out.println(n);
    }
}