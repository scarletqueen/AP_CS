import java.util.Scanner;

public class CountSets {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int length = console.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = console.nextInt();
        }

        int count = 0, match = 1;
        for (int i = 1; i < length; i++) {
            if ((array[i] == array [i-1]) ) {
                if (match == 1) {
                    count++;
                    match = 0;
                }
            } else {
                match = 1;
            }
        }
        System.out.println(count);
    }
}