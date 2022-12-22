// n! means n × (n − 1) × ... × 3 × 2 × 1
// For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
// and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
// Find the sum of the digits in the number 100!

public class ID20 {
    public static int mul (int index, int factorial[], int dim) {
        int carry = 0;
        for (int i = 0; i < dim; ++i) {
            int prod = (factorial[i] * index) + carry;
            factorial[i] = prod % 10;
            carry = prod / 10;
        }
        while (carry != 0) {
            factorial[dim] = carry % 10;
            carry = carry / 10;
            dim++;
        }
        return dim;
    }

    public static void main (String args[]) {
        int factorial[] = new int[200];
        factorial[0] = 1;
        int dim = 1;
        for (int x = 2; x <= 100; ++x) {
            dim = mul(x, factorial, dim);
        }
        String num = "";
        for (int i = dim - 1; i >= 0; --i) {
            num += factorial[i];
        }
        int sum = 0;
        for (int i = 0; i < num.length(); ++i) {
            sum += Character.getNumericValue(num.charAt(i));
        }
        System.out.println("the sum of the digits in the number 100! is: " + sum);
    }
}