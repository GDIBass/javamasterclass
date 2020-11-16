package academy.learnprogramming.section6;

import academy.learnprogramming.section6.inheritance.Animal;
import academy.learnprogramming.section6.inheritance.Dog;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1,1 ,5, 5);
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "Silky");
        dog.eat();
        dog.walk();
    }

    public static void mainOld(String[] args) {
        Account bobsAccount = new Account("12345", 0.00, "Bob Brown", "bob@bob.com", "22244433333");

        bobsAccount.withdraw(100);
        bobsAccount.deposit(50);
        bobsAccount.withdraw(100);
        bobsAccount.deposit(51);
        bobsAccount.withdraw(100);
    }
}
