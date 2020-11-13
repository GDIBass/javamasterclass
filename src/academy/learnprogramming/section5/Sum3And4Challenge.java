package academy.learnprogramming.section5;

public class Sum3And4Challenge {
    public static void main(String[] args) {
        int sum = 0;
        int found = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i);
                sum += i;
                found++;
                if (found >= 5) {
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}
