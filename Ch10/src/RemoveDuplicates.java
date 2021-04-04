import java.util.Scanner;
import java.util.ArrayList;

public class RemoveDuplicates {
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

        System.out.println();
        System.out.println("Your original list: " + array.toString());
        System.out.println();

        for(int i = 0; i < array.size(); i++) {
            for(int j = i + 1; j < array.size(); j++) {
                if(array.get(i).equalsIgnoreCase(array.get(j))){
                    array.remove(j);
                    j--;
                }
            }
        }

        System.out.println("Your list with duplicates removed: " + array.toString());
        System.out.println();
    }
}
