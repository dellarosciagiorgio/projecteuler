// If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
// If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
// NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.
public class ID17 {
    private static String words (int index) {
        String[] units = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety", "hundred"};
        if (String.valueOf(index).length() == 1) {
            return units[index];
        }
        if (String.valueOf(index).length() == 2 && index > 20 && (index % 10) != 0) {
            int a = index / 10;
            int b = index % 10;
            return (tens[a] + "" + units[b]);
        }
        if (String.valueOf(index).length() == 2 && index > 9 && index < 20 && (index % 10) != 0) {
            return (units[index]);
        }
        if (String.valueOf(index).length() == 2 && index > 9 && (index % 10) == 0) {
            int a = index / 10;
            return (tens[a]);
        }
        if (String.valueOf(index).length() == 3 && (index % 100) != 0) {
            int a = index / 100;
            int b = index % 100;
            return (units[a] + "hundred" + "and" + words(b));
        }
        if (String.valueOf(index).length() == 3 && (index % 100) == 0) {
            return (words(index / 100) + "hundred");
        }
        if (String.valueOf(index).length() == 4) {
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
/*
public class ID17 {
    public static String unitsAssociation (String[] words, int n) {
        String s = null;
        switch (n) {
            case 1: s = words[n - 1]; break;
            case 2: s = words[n - 1]; break;
            case 3: s = words[n - 1]; break;
            case 4: s = words[n - 1]; break;
            case 5: s = words[n - 1]; break;
            case 6: s = words[n - 1]; break;
            case 7: s = words[n - 1]; break;
            case 8: s = words[n - 1]; break;
            case 9: s = words[n - 1]; break;
            case 10: s = words[n - 1]; break;
            case 11: s = words[n - 1]; break;
            case 12: s = words[n - 1]; break;
            case 13: s = words[n - 1]; break;
            case 14: s = words[n - 1]; break;
            case 15: s = words[n - 1]; break;
            case 16: s = words[n - 1]; break;
            case 17: s = words[n - 1]; break;
            case 18: s = words[n - 1]; break;
            case 19: s = words[n - 1]; break;
            default: break;
        }
        return s;
    }

    public static String tensAssociation (String[] words, int n) {
        String s = "";
        switch (n) {
            case 20: s = words[n + 17]; break;
            case 30: s = words[n + 17]; break;
            case 40: s = words[n + 17]; break;
            case 50: s = words[n + 17]; break;
            case 60: s = words[n + 17]; break;
            case 70: s = words[n + 17]; break;
            case 80: s = words[n + 17]; break;
            case 90: s = words[n + 17]; break;
            default: break;
        }
        return s;
    }

    public static void main (String[] args) {
        String[] words = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        long c = 0L;
        for (int i = 1; i <= 21; ++i) {
            int tmp = i;
            if (i < 20) {
                c += unitsAssociation(words, i).length();
            }
            else if (i > 20 && i < 100) {
                //tens
                c += unitsAssociation(words, tmp / 10).length();
                //units
                int app = i - ((tmp / 10) * 10);
                c += unitsAssociation(words, app).length();
            }
            else {
                //hundreds
                c += unitsAssociation(words, tmp / 100).length();
                c += 7;
                //tens
                c += unitsAssociation(words, tmp / 10).length();
                //units
                int app = i - ((tmp / 10) * 10);
                c += unitsAssociation(words, app).length();
                //manca l'"and"
            }
        }
        System.out.println("the letters used to write all the numbers from 1 to 1000 are: " + c);
    }
}
*/