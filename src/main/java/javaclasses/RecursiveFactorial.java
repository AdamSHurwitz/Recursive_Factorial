package javaclasses;

/**
 * Created by adamhurwitz on 2/27/16.
 */
public class RecursiveFactorial {
    static private final String LOG_TAG = RecursiveFactorial.class.getSimpleName();

    static int n = 0;

    public static void main(String[] arg) {
        System.out.println("Answer is: " + recursiveFactorial(n));
    }

    public static int recursiveFactorial(int n) {
        int s = 1;
        for (int x = 1; x<= n; x++){
            s = x * s;
        }
        return s;
    }
}
