import java.util.Scanner;

public class ReverseString {

    public static String olleh(String str) {

        int n = str.length();
        String reverse = "";
        for (int i=1; i<=n; i++) {
            reverse = reverse + str.charAt(n-i);
        }
        return reverse;
    }

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.print(olleh(str));

    }
}
