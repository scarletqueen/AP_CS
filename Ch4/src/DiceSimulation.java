import java.util.Scanner; // Scanner class

public class DiceSimulation {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter desired sum of two dice: ");
        int desiredSum = console.nextInt();                   // user input of desired sum
        System.out.print("Enter number of rolls: ");
        int numberRolls = console.nextInt();                  // user input of number of times they want the dice to roll

        int countSuccess = 0; // how many times the dice sum is the same
        int sumOfTwoDice;
        double probability;

        // calculating the amount of times the count = the desired sum
        for (int i=0; i <= numberRolls; i++) {
            sumOfTwoDice = (int) (Math.random() * 6 + 1) + (int) (Math.random() * 6 + 1);
            if (sumOfTwoDice == desiredSum) {
                countSuccess++;
            }
        }

        // calculating the probability
        probability = ( (double) countSuccess) / ( (double) numberRolls);
        probability = Math.round (probability * 100.0) / 100.0;
        System.out.println("probability: " + probability);

    }

}
