package academy.learnprogramming.section4;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }

        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        long miles = toMilesPerHour(kilometersPerHour);

        String output = miles == -1
                ? "Invalid Value"
                : kilometersPerHour + " km/h = " + miles + " mi/h";
        System.out.println(output);
    }
}
