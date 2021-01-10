import java.util.Scanner;
import java.util.Arrays;

public class StringMax {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = console.nextLine();

        System.out.println("max char:     " + maxValue(str));
        System.out.println("in order:     " + AscendingOrder(str));

    }
    public static Character maxValue(String s) {
        int length = s.length();
        int maxValue = s.charAt(0);
        int nextValue = 0;
        for (int i = 0; i < length; i++) {
            nextValue = s.charAt(i++);
            if (nextValue > maxValue) {
                maxValue = nextValue;
            } else {
                maxValue = maxValue;
            }
        }
        return (char) maxValue;
    }


    public static String AscendingOrder(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String ascString = String.valueOf(chars);
        return ascString;
    }
}

