import java.util.Scanner;                                     // needed for Scanner class

public class StairsUserSize {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int s;                                                // declaring the s variable

        System.out.print("enter the total # of stairs:  ");   // provide user prompt
        s = console.nextInt();                                // get TOTAL_STAIRS from user
        System.out.println();

        stairs(s);                                            // calling s in the method
        bottomLine(s);

    }

    public static void spaces(int k, String p) {              // calling k and p to eliminate redundancy
        for (int j = 1; j <= k; j++) {
            System.out.print(" ");
        }
        System.out.print(p);
    }

    public static void stairs(int s) {                       // calling s to replace TOTAL_STAIRS
        for (int i = 1; i <= s; i++) {
            int n = (s - i) * 5;
            int m = (i-1) * 5;

            spaces(n,"  O  ******");                      // using the spaces method to create body of stairs
            spaces(m,"*");
            System.out.println(" ");

            spaces(n," /|\\ *");
            spaces(m,"     *");
            System.out.println(" ");

            spaces(n," / \\ *");
            spaces(m,"     *");
            System.out.println(" ");
        }
    }

    public static void bottomLine(int s) {                  // calling s to replace TOTAL_STAIRS
        for (int i = 1; i <= 5 * s + 7; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

