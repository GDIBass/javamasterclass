package academy.learnprogramming.section8;

import java.util.Scanner;

public class Arrays {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        System.out.println(getAverage(myIntegers));
    }

    public static double getAverage(int [] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum / array.length;
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void mainOld(String[] args) {
//        int[] myIntArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//        myIntArray[5] = 50;
        int[] myIntArray = new int[10];
        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i * 10;
        }
        printArray(myIntArray);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " value is " + array[i]);
        }
    }
}
