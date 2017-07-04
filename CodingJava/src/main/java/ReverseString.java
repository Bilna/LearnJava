/**
 * Created by Bilna on 04-07-2017.
 */
public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseTailRecursively("hello", ""));
    }

    static String reverseString(String s) {
        //using StringBuffer
        StringBuffer sbuf = new StringBuffer(s);
        System.out.println(sbuf.reverse());
        // Not using StringBuffer
        char[] charAr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            charAr[i] = s.toCharArray()[s.length() - 1 - i];
        }
        System.out.println(new String(charAr));
        return s;
    }

    public static String reverseRecursively(String str) {
        if (str.length() < 2) {
            return str;
        }
        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }

    public static String reverseTailRecursively(String str, String str1) {
        if (str.length() < 2) {
            return str + str1;
        }
        return reverseTailRecursively(str.substring(1), (str.charAt(0) + str1));
    }
}
