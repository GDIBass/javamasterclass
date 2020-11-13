package academy.learnprogramming.section5;

public class WhileStatement {
    public static void main(String[] args) {
        int count = 1;
        while (count != 6) {
            System.out.println("Not 6: " + count);
            count++;
        }

        for (count = 1; count != 6; count++) {
            System.out.println("not 6: " + count);
        }

        count = 1;
        while(true) {
            if (count == 6) {
                break;
            }
            System.out.println("not 6: " + count);
            count++;
        }
        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count != 6);
    }
}
