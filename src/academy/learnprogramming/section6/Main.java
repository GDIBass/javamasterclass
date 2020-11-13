package academy.learnprogramming.section6;

public class Main {
    public static void main(String[] args) {
        Account bobsAccount = new Account("12345", 0.00, "Bob Brown", "bob@bob.com", "22244433333");

        bobsAccount.withdraw(100);
        bobsAccount.deposit(50);
        bobsAccount.withdraw(100);
        bobsAccount.deposit(51);
        bobsAccount.withdraw(100);
    }
}
