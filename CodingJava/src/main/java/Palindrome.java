/**
 * Created by Bilna on 04-07-2017.
 */
public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("malaymyalam"));
        System.out.println(isPalindrome(454));
    }

    public static boolean isPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i <= s.length() / 2 & j >= s.length() / 2; i++, j--) {
            if (!(s.charAt(i) == s.charAt(j))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int n) {
        int sum = 0, r = 0;
        int temp = n;
        while (n > 0) {
            r = n % 10;
            sum = sum * 10 + r;
            n = n / 10;
        }
        if (temp == sum)
            return true;
        else return false;
    }
}
