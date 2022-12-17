// 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
// What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

public class ID5 {
    public static void main (String[] args) {
        int x = 2520, c;
        boolean y = false;
        while (y == false) {
            c = 0;
            ++x;
            if (x % 20 == 0) {
                for (int z = 1; z <= 20; ++z) {
                    if (x % z == 0) {
                        ++c;
                    }
                }
                if (c == 20) {
                    y = true;
                }
            }
        }
        System.out.println("the smallest positive number that is evenly divisible by all of the numbers from 1 to 20 is: " + x);
    }
}