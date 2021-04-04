import java.util.Scanner;

public class WriteBinary {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int decimal = console.nextInt();

        //System.out.print("Binary expression: "); for WriteBinaryString
        writeBinary(decimal);
        System.out.println();
    }
    public static void writeBinary(int decimal) {
        if (decimal < 0) {
            System.out.print("-");
            writeBinary(-decimal);
        } else if(decimal < 2)  {
            //Integer.toString(decimal); for WriteBinaryString
            System.out.print(decimal);
            return;
        } else {
            writeBinary(decimal / 2);
            int binary = decimal % 2;
            //Integer.toString(binary); for WriteBinaryString
            System.out.print(binary);
        }
    }
}
