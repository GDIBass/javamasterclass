package academy.learnprogramming.section7.encapsulation;

public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Matt";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//
//        System.out.println("Remaining health = " + player.healthRemaining());
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);

        EnhancedPlayer player = new EnhancedPlayer("Matt", 50, "Sword");
        System.out.println("initial health = " + player.getHealth());
    }
}
