package academy.learnprogramming.section6;

public class Account {
    private String number;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public Account() {
        this("1234", 2.5, "Default name", "Default address", "Default phone");
    }

    public Account(String number, double balance, String name, String email, String phoneNumber) {
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit accepted of " + depositAmount + ".  New balance is " + this.balance);
    }

    public void withdraw(double withdrawAmount) {
        if (this.balance - withdrawAmount < 0) {
            System.out.println("You don't have a big enough balance to make this withdraw.  You only have " + this.balance);
        } else {
            this.balance -= withdrawAmount;
            System.out.println("Withdraw of " + withdrawAmount + " processed.  Remaining balance: " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
