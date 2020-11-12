package academy.learnprogramming.section5;

public class Switch {
    public static void main(String[] args) {
        int value = 1;
        if (value == 1) {
            System.out.println("Value is 1");
        } else if (value == 2) {
            System.out.println("its 2");
        } else {
            System.out.println("not one or two");
        }

        int switchValue = 1;
        switch (switchValue) {
            case 1:
                System.out.println("Value was one");
                break;
            case 2:
                System.out.println("Value two");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("three four or 5");
                break;
            default:
                System.out.println("not either");
                break;
        }

        char switchChar = 'a';
        switch (switchChar) {
            case 'a':
                System.out.println("is a");
                break;
            case 'b':
                System.out.println("is b");
                break;
            case 'c':
                System.out.println("is c");
                break;
            default:
                System.out.println("Not one of those");
                break;
        }

        String switchStr = "january";
        switch(switchStr.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Idk");
                break;
        }
    }
}
