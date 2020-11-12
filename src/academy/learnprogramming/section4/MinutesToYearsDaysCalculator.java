package academy.learnprogramming.section4;

public class MinutesToYearsDaysCalculator {
    public static final int MINUTES_PER_YEAR = 525600;
    public static final int MINUTES_PER_DAY  = 60 * 24;

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int years = (int) minutes / MINUTES_PER_YEAR;
        long remainingMinutes = minutes % MINUTES_PER_YEAR;
        int days = (int) remainingMinutes / MINUTES_PER_DAY;

        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }
}
