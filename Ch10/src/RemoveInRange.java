import java.util.ArrayList;
import java.util.Scanner;

public class RemoveInRange {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ArrayList<String> array = new ArrayList<>();

        System.out.println();
        System.out.println("Please enter an alphabetical sequence of strings separated\nby spaces. The end of the sequence must be signified using\nthe sentinel value lastString, followed by a return.\n");

        String input = console.next();
        while(!input.equals("lastString")) {
            array.add(input);
            input = console.next();
        }

        System.out.println("Your original list: " + array.toString());
        System.out.println();

        System.out.println("Now please enter your start String");
        String startString = console.next();

        System.out.println();
        System.out.println("Finally, please enter your end String");
        String endString = console.next();

        for(int i = 0; i < array.size(); i++)
        {
            if(array.get(i).compareTo(startString) >= 0 && array.get(i).compareTo(endString) <= 0)
            {
                array.remove(i);
                i--;
            }

        }

        System.out.println();
        System.out.println("Your reduced list: " + array.toString());
    }
}
