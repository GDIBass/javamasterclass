package academy.learnprogramming.lessons;

public class MethodOverloading {
    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(5, 1);
        calcFeetAndInchesToCentimeters(25);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || (inches < 0) || (inches > 12)) {
            System.out.println("Invalid input");
            return -1;
        }

        double centimeters = ((feet * 12) + inches) * 2.54;
        System.out.println(feet + " feet " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }

        return calcFeetAndInchesToCentimeters((int) (inches / 12), inches % 12);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static void calculateScore() {
        System.out.println("No player name, no player score.");
    }
}
