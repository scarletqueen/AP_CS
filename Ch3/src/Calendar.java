import java.util.Scanner;     // imported the Scanner class

public class Calendar {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("");

        int days = getNumber(console, "Please enter the number of days in the month: ");   // used parameter getNumber to return number of days as int
        int firstSun = getNumber(console, "Please enter the number of the day of the first Sunday: "); // used parameter getNumber to return firstSun as int

        System.out.println("");
        System.out.println("  Sun    Mon    Tue    Wed    Thu    Fri    Sat"); // print name of the days
        System.out.println("+------+------+------+------+------+------+------+");


        int emptyBoxTop = (8 - firstSun) % 7;            // print the number of boxes before the days start
        for(int i = 1; i <= emptyBoxTop; i++ ) {
            System.out.print("|      ");
        }

        for(int i = 1;  i <= days; i++) {                          // print the number of boxes with days inside
            if ((i + (8 - firstSun)) % 7 == 0) {                   // prints the number and a new line
                System.out.print("|" + padded(i, 4) + "  ");
                System.out.println("|");
            }
            else  {
                System.out.print("|" + padded(i, 4) + "  "); // prints the number

            }
        }
        int emptyBoxBottom = ((8 - ((days + emptyBoxTop) % 7)) % 8); // prints the empty boxes on the bottom of the calendar
        for (int i = 1; i <= emptyBoxBottom - 1; i++) {
            System.out.print("|      ");
        }

        if (emptyBoxBottom != 0) {  // if there is no empty box, prints a line so calendar is finished
            System.out.print("|");
            System.out.println();
        }

        System.out.println("+------+------+------+------+------+------+------+");
        System.out.println("");

    }
    public static int getNumber(Scanner sc, String s) {     // parameter getNumber
        System.out.print(s);                              // prints the string
        return sc.nextInt();                                // returns console as int
    }

    public static String padded(int n, int width) {         // used for formatting
        String s = "" + n;
        for (int i = s.length(); i < width; i++) {
            s = " " + s;
        }
        return s;                                          // retuns the boxes with the proper spaces inside them
    }

}
/*
1.
Please enter the number of days in the month: 30
Please enter the number of the day of the first Sunday: 5

  Sun    Mon    Tue    Wed    Thu    Fri    Sat
+------+------+------+------+------+------+------+
|      |      |      |   1  |   2  |   3  |   4  |
|   5  |   6  |   7  |   8  |   9  |  10  |  11  |
|  12  |  13  |  14  |  15  |  16  |  17  |  18  |
|  19  |  20  |  21  |  22  |  23  |  24  |  25  |
|  26  |  27  |  28  |  29  |  30  |      |      |
+------+------+------+------+------+------+------+

Charles-Brucker-MacBook-Pro-3:Calendar cfbrucker$ java CalendarsWithInput

2.
Please enter the number of days in the month: 28
Please enter the number of the day of the first Sunday: 1

  Sun    Mon    Tue    Wed    Thu    Fri    Sat
+------+------+------+------+------+------+------+
|   1  |   2  |   3  |   4  |   5  |   6  |   7  |
|   8  |   9  |  10  |  11  |  12  |  13  |  14  |
|  15  |  16  |  17  |  18  |  19  |  20  |  21  |
|  22  |  23  |  24  |  25  |  26  |  27  |  28  |
+------+------+------+------+------+------+------+

 */