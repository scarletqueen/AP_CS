import java.io.FileNotFoundException; // importing the File, FileNotFoundException, and Scanner classes
import java.util.Scanner;
import java.io.File;


public class PersonalityTest {

    public static final int DIMENSIONS = 4; // class constant for dimensions of arrays

    public static void main(String[] args) throws FileNotFoundException {
        performPersonalityTest(); // method to perform the Personality Test
    }

    public static void performPersonalityTest() throws FileNotFoundException {
        //read the file
        Scanner console = new Scanner(System.in); // read the Scanner for file input
        System.out.print("Input file name: ");
        String fileName = console.next();
        File myObj = new File(fileName);
        while(!myObj.exists()) {  // if file doesn't exist then prompt the user again
            System.out.print("File not found. Try again: ");
            fileName = console.next();
            myObj = new File(fileName);
        }
        Scanner myReader = new Scanner(myObj); //Scanner for the inside text of the file
        int count = 1;
        while (myReader.hasNextLine()) { // check the entire file for the input
            String name = myReader.nextLine();
            String answers = myReader.nextLine();

            //method for counting A
            int[] countA = aCount(answers);

            //method for counting B
            int[] countB = bCount(answers);

            //method for compute B percent
            int[] percentB = bPercent(countA, countB);

            //method for compute results
            String results = result(percentB);

            // printing output
            if (count != 1) {
                System.out.println();
            }
            count = 0;
            System.out.println(name + ":");
            System.out.println("    " + countA[0] + "A-" + countB[0] + "B " + countA[1] + "A-" + countB[1] + "B " + countA[2] + "A-" + countB[2] + "B " + countA[3] + "A-" + countB[3] + "B"); // amount of A's and B's
            System.out.println("    [" + percentB[0] + "%, " + percentB[1] + "%, " + percentB[2] + "%, " + percentB[3] + "%] = " + results); // percent of B plus the personality results
        }
    }

    public static int[] aCount(String answers){ // counting the A's
        int[] count = new int[DIMENSIONS];

        for (int i=0; i<answers.length(); i++) { // seeing how many A's are in each group and putting them into an array
            char j = answers.charAt(i);
            if (j == 'A' || j == 'a') {
                if (i % 7 == 0) {
                    count[0]++;
                } else if (i % 7 == 1 || i % 7 == 2) {
                    count[1]++;
                } else if (i % 7 == 3 || i % 7 == 4) {
                    count[2]++;
                } else if (i % 7 == 5 || i % 7 == 6) {
                    count[3]++;
                }
            }
        }
        return count;
    }

    public static int[] bCount(String answers){ // counting the B's
        int[] count = new int[DIMENSIONS];
        for (int i=0; i<answers.length(); i++) { // seeing how many B's are in each group and putting them into an array
            char j = answers.charAt(i);
            if (j == 'B' || j == 'b') {
                if (i % 7 == 0) {
                    count[0]++;
                } else if (i % 7 == 1 || i % 7 == 2) {
                    count[1]++;
                } else if (i % 7 == 3 || i % 7 == 4) {
                    count[2]++;
                } else if (i % 7 == 5 || i % 7 == 6) {
                    count[3]++;
                }
            }
        }
        return count;
    }

    public static int[] bPercent(int[] countA, int[] countB){ // finding the percent of B throughout the groups
        int[] percentValue = new int[DIMENSIONS];
        int[] aValue = countA;
        int[] bValue = countB;
        for (int i = 0; i < DIMENSIONS; i++) {
            int sumValue = aValue[i] + bValue[i]; // to make sure the omitted answers are not counted in the final sum
            double value = (100.0*bValue[i]/sumValue);
            percentValue[i] = (int) Math.round(value);
        }
        return percentValue;
    }

    public static String result(int[] percentB){ // finding out the personality!!
        String results = "";
        int[] percent = percentB;
        for (int i=0; i<percent.length; i++) {
            if (percentB[i] < 50) {  // less than 50%
                if(i==0) {
                    results = results + "E";
                } else if (i==1) {
                    results = results + "S";
                } else if (i==2) {
                    results = results + "T";
                } else if (i==3) {
                    results = results + "J";
                }
            } else if (percentB[i] > 50) { // greater than 50%
                if(i==0) {
                    results = results + "I";
                } else if (i==1) {
                    results = results + "N";
                } else if (i==2) {
                    results = results + "F";
                } else if (i==3) {
                    results = results + "P";
                }
            } else {
                results = results + "X"; // equal to 50%
            }
        }
        return results;
    }
}
