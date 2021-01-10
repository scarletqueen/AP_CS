
import java.util.Scanner; // Scanner class

public class Roman {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in); // new Scanner

        System.out.print("enter two positive integers, smaller followed by larger: ");
        int lowLim = console.nextInt(); // getting the first integer
        int highLim = console.nextInt(); // getting the second integer

        console.close(); // closing the console

        toRoman(lowLim, highLim); // calling the method toRoman with parameters lowLim and highLim

    }
    public static void toRoman(int n, int m) {    // I = 1 ; V = 5 ; X = 10 ; L = 50 ; C = 100;  D = 500 ; M = 1000
        for (int j = n; j <= m; j++) { // getting all of the numerals in the range given by user
            int i = j;
            String roman = "";
            for (; i != 0; ) {  // while loop to make sure the program only runs till 0
                if (i >= 1000 && i < 4000) { // condition for certain roman numeral
                    roman = roman + "M"; // adding that numeral to roman string
                    i = i - 1000; // minus operator to get remainder for the rest of the numeral
                } else if (i < 1000 && i >= 900) {
                    roman = roman + "CM";
                    i = i % 900;
                } else if (i < 900 && i >= 500) {
                    roman = roman + "D";
                    i = i % 500;
                } else if (i < 500 && i >= 400) {
                    roman = roman + "CD";
                    i = i % 400;
                } else if (i < 400 && i >= 100) {
                    roman = roman + "C";
                    i = i % 100;
                } else if (i < 100 && i >= 90) {
                    roman = roman + "XC";
                    i = i % 90;
                } else if (i < 90 && i >= 50) {
                    roman = roman + "L";
                    i = i % 50;
                } else if (i < 50 && i >= 40) {
                    roman = roman + "XL";
                    i = i % 40;
                } else if (i < 40 && i >= 10) {
                    roman = roman + "X";
                    i = i % 10;
                } else if (i == 9) {
                    roman = roman + "IX";
                    i = i - 9; 
                } else if (i < 9 && i >= 5) {
                    roman = roman + "V";
                    i = i % 5;
                } else if (i == 4) {
                    roman = roman + "IV";
                    i = i - 4;
                } else if (i < 4 && i >= 1) {
                    roman = roman + "I";
                    i = i - 1;
                }
            }
            System.out.println(roman); // printing the entire string
        }
    }
}

