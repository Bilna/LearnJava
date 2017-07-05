/**
 * Created by Bilna on 05-07-2017.
 */
public class Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorialTailRecursive(5, 1));
    }

    public static int factorial(int n) {
        if (n < 2 & n >= 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    //reuses stack frame
    public static int factorialTailRecursive(int n, int acc) {
        if (n < 2 & n >= 0) {
            return acc;
        } else {
            return factorialTailRecursive(n - 1, n * acc);
        }
    }
}
