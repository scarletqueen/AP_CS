public class Factorial {
    static int factorial(int b){
        int q=1;
        for (int i=1; i<=b; i++){
            q = q * i;
        }
        return q;
    }

    public static void main(String args[]) {
        System.out.println(factorial (5));
    }
}
