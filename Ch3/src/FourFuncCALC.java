import java.util.Scanner;                                                           // import Scanner class

public class FourFuncCALC {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("");
        double num1 = getDouble(console,"Please enter your first  number: ");    // calling the getDouble method for first num
        double num2 = getDouble(console,"Please enter your second number: ");    // calling the getDouble method for second num

        System.out.println();
        System.out.println("sum        = " + sum(num1, num2));                     // calling sum method
        System.out.println("difference = " + difference(num1, num2));              // calling difference method
        System.out.println("product    = " + product(num1, num2));                 // calling product method
        System.out.println("quotient   = " + quotient(num1, num2));                // calling quotient method
        System.out.println();
    }

    public static double getDouble(Scanner sc, String s) {
        System.out.print(s);                                                       // print our string parameter

        return sc.nextDouble();                                                    // return input to wherever scanner is called
    }
    public static double sum(double n1, double n2) {
        return n1 + n2;
    }             // sum
    public static double difference(double n1, double n2) {
        return n1 - n2;
    }      // difference
    public static double product(double n1, double n2) {
        return n1 * n2;
    }         // product
    public static double quotient(double n1, double n2) {
        return n1 / n2;
    }        // quotient
}

