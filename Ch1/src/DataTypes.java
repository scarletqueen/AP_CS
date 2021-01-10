/*
DATA TYPES

fundamental                     other
-----------                     -----
int         4 bytes (32-bit)  |  long      8 bytes (64-bit)
double      8 bytes (64-bit)  |  float     4 bytes (32-bit)
char        2 bytes (16-bit)  |  bytes     8 bits
boolean     1 bit             |  short     2 bytes (16-bit)

 operators
 ---------
 + , - , * , / , %
 precedence - order of operations
 unary             + , -
 multiplicative    * , /, %
 additive          + , -
 */

public class DataTypes {
    public static void main(String[] args) {

        int a = 1000000;
        System.out.println(a * a);

        long b = 1000000;
        System.out.println(b * b);

        double c = 4.35;
        System.out.println(c * 100);

        System.out.println();

        char d = 'c';
        System.out.println(d);

        boolean e = true;
        System.out.println(e);

        System.out.println(8. / 3);
        System.out.println(8 % 3);
        System.out.println(5.33 % 3);
        System.out.println(9 % 2);

        System.out.println();

        System.out.println(13 * -7);
        System.out.println(50 - 26 - 24);

        System.out.println(18.0 / 4);
        System.out.println(18. / 4);
        System.out.println(18 / 4.0);
        System.out.println(18.0 /4.0);

        System.out.println((int) 4.5 );
        System.out.println((int) 4.5 / 0.5);
        System.out.println((int) (4.5 / 0.5) );
    }
}
