/**
 * Created by Bilna on 04-07-2017.
 */
public class FindSetBit {
    public static void main(String[] args) {
        method1(27);
        method2(27);
        method3(27);
    }

    public static void method1(long n) {
        int counter = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                counter++;
            }
            n = (n >> 1);
        }
        System.out.println(counter);
    }

    public static void method2(long n) {
        int counter = 0;
        while (n > 0) {
            if ((n % 2) == 1) {
                counter++;
            }
            n = n / 2;
        }
        System.out.println(counter);
    }

    public static void method3(long n) {
        int counter = 0;
        while (n > 0) {
            counter++;
            n = n & (n - 1);
        }
        System.out.println(counter);
    }

}
