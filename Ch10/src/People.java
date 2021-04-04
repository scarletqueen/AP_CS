import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.lang.*;

public class People {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();

        String name;
        int age;
        double weight;

        name = console.next();
        while (name.compareTo("stop") != 0) {
            age = console.nextInt();
            weight = console.nextDouble();

            Person p = new Person(name, age, weight);
            people.add(p);

            name = console.next();
        }

        System.out.println("Original list: \n" + people.toString());
        Collections.sort(people);

        System.out.println();
        System.out.println("Sorted list: \n" + people.toString());
    }
}
