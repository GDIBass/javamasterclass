package academy.learnprogramming.section5;

public class ForStatement {
    public static void main(String[] args) {
        // for (init; termination; increment) { }
        for (int i = 2; i <= 8; i++) {
            System.out.printf("%.2f%n", calculateInterest(10000.0, i));
        }

        for (int i = 8; i >= 2; i--) {
            System.out.printf("%.2f%n", calculateInterest(10000.0, i));
        }

        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is prime");
                if (count == 10) {
                    System.out.println("Exiting");
                    break;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
