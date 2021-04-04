import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Count2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ArrayList<String> array = new ArrayList<>();

        System.out.println();
        System.out.println("Please enter a sequence of strings separated\nby spaces. The end of the sequence must be signified using\nthe sentinel value lastString, followed by a return.\n");
        String input = console.next();

        while(!input.equals("lastString")) {
            array.add(input);
            input = console.next();
        }

        ArrayList<String> arrayCopy = new ArrayList<>(array);


        //System.out.println();
        //System.out.println("Your original list: " + array);

        Collections.sort(array);
        ArrayList<CountClass> letters = new ArrayList<>();


        //array.replaceAll(String::toLowerCase);

        int counter = 1;
        ArrayList<Integer> count = new ArrayList<>();

        for(int i = 0; i < array.size() - 1; i++) {
            if(array.get(i).equalsIgnoreCase(array.get(i+1))){
                counter++;
            } else {
                count.add(counter);
                CountClass term = new CountClass(counter, array.get(i), arrayCopy.indexOf(array.get(i)));
                letters.add(term);
                counter = 1;
            }
        }

        if (array.size() == 0) {
            count.clear();
        } else if (!(array.get(array.size() - 2).equalsIgnoreCase(array.get(array.size()-1)))) {
            count.add(1);
            CountClass term = new CountClass( 1 , array.get(array.size() - 1), arrayCopy.indexOf(array.get(array.size() - 1)));
            letters.add(term);
        } else {
            count.add(counter);
            CountClass term = new CountClass(counter, array.get(array.size() - 2), arrayCopy.indexOf(array.get(array.size() - 2)));
            letters.add(term);
        }

        Collections.sort(letters);
        //System.out.println(arrayCopy);

        for(int i = 0; i < letters.size() - 1 ; i++) {
            if(letters.get(i).getCounter() == letters.get(i+1).getCounter()) {
                int index1 = arrayCopy.indexOf(letters.get(i).getLetter());
                int index2 = arrayCopy.indexOf(letters.get(i + 1).getLetter());
                if(index1 > index2) {
                    Collections.swap(letters, i, i + 1);
                }
            }
        }

        for(int i = 0; i < letters.size(); i++) {
            System.out.println(letters.get(i));
        }

        //Collections.sort(count);
        //System.out.println("Count: " + count);
        //System.out.println(letters);
    }

}
