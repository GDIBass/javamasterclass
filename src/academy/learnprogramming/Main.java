package academy.learnprogramming;

import academy.learnprogramming.section4.PlayingCat;

public class Main {
    public static void main(String[] args) {
//        SecondAndMinutesChallenge.main(args);
        System.out.println(PlayingCat.isCatPlaying(true, 10));
        System.out.println(PlayingCat.isCatPlaying(false, 36));
        System.out.println(PlayingCat.isCatPlaying(false, 35));
        System.out.println(PlayingCat.isCatPlaying(true, 45));
    }
}
