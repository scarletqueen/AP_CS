import java.util.Scanner;
import java.text.DecimalFormat;

public class PEEB1 {
    public static final double h = 6.626068E-34;                                   // class constants h, c, k
    public static final double c = 299792500;
    public static final double k = 1.38066E-23;

    public static void main(String [] args) {
        Scanner console = new Scanner(System.in);
        double wavelength = console.nextDouble();
        double wavelength2 = wavelength * 1.0E-6;                                  // changing microns to meters
        double temperature = console.nextDouble();

        double numerator = 2 * h * Math.pow(c, 2) * Math.pow(wavelength2, -5);     // numerator of planck's equation
        double fraction = (h * c) / (wavelength2 * k * temperature);
        double denominator = Math.exp(fraction) - 1;                               // denominator of planck's equation

        DecimalFormat df1 = new DecimalFormat("0.00E00");                   // scientific notation format declaration
        double B = (numerator) / (denominator);                                   // full planck's equation
        System.out.println("Radiant photon flux at a given wavelength\nand temperature using Planck's Law.");
        System.out.println("wavelength in microns: temperature in degrees Kelvin: radiant flux B = " + df1.format(B).toLowerCase() + " Wm-3steradian-1");

        // main print statement for the answer

    }
}
