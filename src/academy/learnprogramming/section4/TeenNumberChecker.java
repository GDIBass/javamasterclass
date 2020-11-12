package academy.learnprogramming.section4;

public class TeenNumberChecker {
    public static boolean isTeen (int number) {
        return number > 12 && number < 20;
    }

    public static boolean hasTeen (int numOne, int numTwo, int numThree) {
        return isTeen(numOne) || isTeen(numTwo) || isTeen(numThree);
    }
}
