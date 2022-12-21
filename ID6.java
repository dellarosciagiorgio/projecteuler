//The sum of the squares of the first ten natural numbers is, $1^{2}+2^{2}+\ldots+10^{2}=385$
//The square of the sum of the first ten natural numbers is, $\left(1+2+\ldots+10\right)^{2}=3025$
//Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025-385=2640.
//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

public class ID6 {
    public static void main (String[] args) {
        int sumsq = 0, sqsum = 0;
        for (int x = 1; x <= 100; ++x) {
            sumsq += Math.pow(x, 2);
        }
        for (int x = 100; x > 0; --x) {
            sqsum += x;
        }
        sqsum = (int) Math.pow(sqsum, 2);
        System.out.println("the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum is: " + (sqsum - sumsq));
    }
}