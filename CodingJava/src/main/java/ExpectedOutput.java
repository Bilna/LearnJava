/**
 * Created by Bilna on 04-07-2017.
 */
public class ExpectedOutput {
    public static void main(String[] args) {
        method1(null);
        method2(null);
    }

    static void method1(String s) {
        System.out.println("String");
    }

    static void method1(Object o) {
        System.out.println("Object");
    }
    static void method2(Exception e) {
        System.out.println("Exception");
    }

    static void method2(ArithmeticException ae) {
        System.out.println("ArithmeticException");
    }
}
