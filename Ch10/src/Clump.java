import java.util.ArrayList;
import java.util.Scanner;

public class Clump {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ArrayList<String> array = new ArrayList<>();

        System.out.println();
        System.out.println("Please enter a sequence of strings separated\nby spaces. End the sequence with the sentinel\nvalue \"stop\", followed by a return.\n");

        String input = console.next();

        while(!input.equals("stop")) {
            array.add(input);
            input = console.next();
        }


        System.out.println("Your original list: " + array.toString());
        System.out.println();

        for(int i = 0; i < array.size() - 1; i++)
        {
            String newStr = "(" + array.get(i) + " " + array.get(i + 1) + ")";

            array.set(i, newStr);
            array.remove(i + 1);
        }

        System.out.println("Your clumped list: " + array.toString());
    }
}
