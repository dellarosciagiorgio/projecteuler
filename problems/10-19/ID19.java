// You are given the following information, but you may prefer to do some research for yourself.
// + 1 Jan 1900 was a Monday.
// + Thirty days has September,
//   April, June and November.
//   All the rest have thirty-one,
//   Saving February alone,
//   Which has twenty-eight, rain or shine.
//   And on leap years, twenty-nine.
// + A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
// How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?

public class ID19 {
    private static int dayOfWeek (int year, int month, int day) {
        int m = (month - 3 + 4800) % 4800;
        int y = (year + m / 12) % 400;
        m %= 12;
        return (y + (y / 4) - (y / 100) + (((13 * m) + 2) / 5) + day + 2) % 7;
    }

    public static void main (String[] args) {
        int c = 0;
        for (int years = 1901; years <= 2000; years++) {
            for (int months = 1; months <= 12; months++) {
                if (dayOfWeek(years, months, 1) == 0)
                    c++;
            }
        }
        System.out.println(c + " sundays fell on the first of the month during the twentieth century");
    }
}