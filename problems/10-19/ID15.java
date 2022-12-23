// Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.
// How many such routes are there through a 20×20 grid?

public class ID15 {
    public static void main(String[] args) {
        long routes = 1;
        for (int i = 0; i < 20; ++i) {
            routes = (routes * ((2 * 20) - i)) / (i + 1);
        }
        System.out.println("there are " + routes + " routes in a 20x20 grid");
    }
}