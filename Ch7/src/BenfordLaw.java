import java.util.Scanner; // importing Scanner and File classes
import java.io.File;
import java.io.FileNotFoundException;

public class BenfordLaw {


    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Let us count those leading digits..."); // user input of the text files
        System.out.print("input file name? ");
        String fileName = console.next();

        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            int zeros = 0; // amount of zeros that may appear in the data set
            int count = 0; // count of the leading digits 1-9
            int[] arr = new int[9];
            while (myReader.hasNextInt()) {
                int data = myReader.nextInt();
                if(data == 0){ // excluding the zeros test case
                    zeros++;
                }
                else{
                    data = Integer.parseInt(Integer.toString(data).substring(0, 1)); // gets the leading digit from the integer
                    count++;
                    arr[data-1]= arr[data-1]+1;
                }
            }
            myReader.close();
            // excluding zeros
            if(zeros > 0){
                System.out.println("excluding "+ zeros +" zeros");
            }
            // format of the console output
            System.out.println("Digit Count Percent");
            // printing the numbers 1-9
            for(int i = 0; i < 9; i++){
                System.out.print("    "+(i+1));
                if(arr[i] >= 10){
                    System.out.print("    ");
                }
                else{
                    System.out.print("     ");
                }
                // percent occurrence of leading digit
                System.out.print(arr[i]);
                double percent = arr[i] * 100.00 / count;
                if(percent >= 10){
                    System.out.print("  ");
                }
                else{
                    System.out.print("   ");
                }
                System.out.printf("%.2f",percent);
                System.out.println();
            }
            System.out.println("Total    "+ count +" 100.00");
        }
        // if file doesn't exist
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
