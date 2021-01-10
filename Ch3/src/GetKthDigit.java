import java.util.Scanner;                      // import Scanner class

public class GetKthDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                  // initializing variable n, k
        int k = sc.nextInt();

        System.out.println(digit(n, k));       // print the output of method call

    }
    public static int digit(int x, int y) {
        for (int i = 0; i < y ; i++) {         // for how many times i is less than the position k
            x /= 10;                           // keep dividing by 10
        }
        return x%10;                           // return the modulus to the method call
    }

}