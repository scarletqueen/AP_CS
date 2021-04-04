import java.util.ArrayList;
import java.util.Scanner;

public class Reverse3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();

        System.out.println();
        System.out.println("Please enter a sequence of integers separated\nby spaces. End the sequence with the sentinel\nvalue 0, followed by a return.\n");

        int input = console.nextInt();
        while (!(input == 0)) {
            array.add(input);
            input = console.nextInt();
        }

        System.out.println("Your original list: " + array.toString());
        System.out.println();

        for(int i = 0; i < array.size() - 2; i += 3) {
                Integer temp1 = array.get(i);
                Integer temp2 = array.get(i + 2);
                array.set(i, temp2);
                array.set(i + 2, temp1);
        }

        System.out.println("Your reversed3 list: " + array.toString());
    }
}
