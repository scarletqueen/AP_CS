import java.util.Scanner;

public class TimeCapsuleUserHeight {
    public static int HEIGHT;
    public static int circles = 1;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter HEIGHT: ");    // prompt for user
        HEIGHT = s.nextInt();                // get HEIGHT from user
        System.out.println();                // for HG output

        star();
        triangleTop();
        line();
        middleBox();
        line();
        triangleBottom();
        star();
    }

    public static void star() {
        for (int i = 0; i <= HEIGHT - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
    }


    public static void triangleTop() {
        for (int i = 1; i <= HEIGHT; i++) {
            for (int j = 1; j <= HEIGHT - i; j++) {
                System.out.print(" ");
            }
            System.out.print("/");

            for (int j = 1; j <= circles; j++) {
                System.out.print("o");
            }
            System.out.print("\\");
            System.out.println();
            circles += 2;
        }

    }

    public static void line() {
        System.out.print("|");
        for (int i = 1; i <= circles - 2; i++) {
            System.out.print("@");
        }
        System.out.print("|");
        System.out.println();
    }

    public static void middleBox() {
        for (int i = 1; i <= (2 * HEIGHT - 3); i++) {
            System.out.print("|@");
            for (int j = 1; j <= circles - 4; j++) {
                System.out.print(" ");
            }
            System.out.println("@|");
        }
    }

    public static void triangleBottom() {
        for (int i = 1; i <= HEIGHT; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("\\");
            for (int j = 1; j <= circles - 2; j++) {
                System.out.print("o");
            }
            System.out.print("/");
            System.out.println();
            circles -= 2;
        }
    }
}

