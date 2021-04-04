import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Count {
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

        array.replaceAll(String::toLowerCase);
        System.out.println();
        System.out.println("Your original list: " + array);

        int counter = 1;
        ArrayList<Integer> count = new ArrayList<>();

        for(int i = 0; i < array.size() - 1; i++) {
            if(array.get(i).equalsIgnoreCase(array.get(i+1))){
                   counter++;
            } else {
                count.add(counter);
                counter = 1;
            }
        }

        if (array.size() == 0) {
            count.clear();
        } else if (!(array.get(array.size() - 2).equalsIgnoreCase(array.get(array.size()-1)))) {
            count.add(1);
        } else {
            count.add(counter);
        }

        Collections.sort(count);
        System.out.println("Count: " + count);
    }
}

