// If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
// If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
// NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.

public class ID17 {
    private static String words (int i) {
        String[] units = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety", "hundred"};
        if (String.valueOf(i).length() == 1) {
            return units[i];
        }
        if (String.valueOf(i).length() == 2 && i > 20 && (i % 10) != 0) {
            int a = i / 10;
            int b = i % 10;
            return (tens[a] + "" + units[b]);
        }
        if (String.valueOf(i).length() == 2 && i > 9 && i < 20 && (i % 10) != 0) {
            return (units[i]);
        }
        if (String.valueOf(i).length() == 2 && i > 9 && (i % 10) == 0) {
            int a = i / 10;
            return (tens[a]);
        }
        if (String.valueOf(i).length() == 3 && (i % 100) != 0) {
            int a = i / 100;
            int b = i % 100;
            return (units[a] + "hundred" + "and" + words(b));
        }
        if (String.valueOf(i).length() == 3 && (i % 100) == 0) {
            return (words(i / 100) + "hundred");
        }
        if (String.valueOf(i).length() == 4) {
            return "onethousand";
        }
        return null;
    }

    public static void main (String[] args) {
        int ans = 0;
        for (int i = 1; i <= 1000; ++i) {
            ans = ans + words(i).length();
        }
        System.out.println(ans);
    }
}