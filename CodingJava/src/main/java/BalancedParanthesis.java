import java.util.Stack;

/**
 * Created by Bilna on 04-07-2017.
 */
public class BalancedParanthesis {
    public static void main(String[] args) {
        String s = "(({}{}))()";
        method1(s);
    }

    /*
        Using Stack
     */
    public static void method1(String s) {
        boolean isContinue = true;
        char[] stringToChar = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; (i < s.length()) & isContinue; i++) {
            switch (stringToChar[i]) {
                case '(':
                    stack.push('(');
                    break;
                case '[':
                    stack.push('[');
                    break;
                case '{':
                    stack.push('{');
                    break;
                case ')':
                    if (stack.isEmpty()) {
                        isContinue = false;
                    } else {
                        stack.pop();
                    }
                    break;
                case ']':
                    if (stack.isEmpty()) {
                        isContinue = false;
                    } else {
                        stack.pop();
                    }
                    break;
                case '}':
                    if (stack.isEmpty()) {
                        isContinue = false;
                    } else {
                        stack.pop();
                    }
                    break;
                default:
                    break;
            }
        }
        if (stack.isEmpty() & isContinue)
            System.out.println("Balanced...");
        else
            System.out.println("Not Balanced...");
    }
}
