package academy.learnprogramming.section4;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo) {
        return (int) (numberOne * 1000d) == (int) (numberTwo * 1000d);
    }
}
