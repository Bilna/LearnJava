/**
 * Created by Bilna on 04-07-2017.
 */
public class FindSetBit {
    public static void main(String[] args) {
        method1(27);
        method2(27);
        method3(27);
    }

    /*
        b=> total number of bits.
        Complexity O(b).
        Depends on word length
        if wordlength 16, complexity is O(16)
    */
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

    /*
        b=> total number of bits.
        Complexity O(b).
        Depends on word length.
        if wordlength 16, complexity is O(16).
    */
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

    /*
        b=> total number of bits set to one
        Complexity O(b)
        Depends on word length and number of bit set to one
        if wordlength 16, and out of 16 bits 7 are set to one then complexity is O(7)
    */
    public static void method3(long n) {
        int counter = 0;
        while (n > 0) {
            counter++;
            n = n & (n - 1);
        }
        System.out.println(counter);
    }

}
