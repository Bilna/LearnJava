import java.util.Stack;

/**
 * Created by Bilna on 04-07-2017.
 */
public class BalancedParanthesis {
    public static void main(String[] args) {
        String s = "{()[]{[]}}";
        method1(s);
    }

    /*
        Using Stack
     */
    public static void method1(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            switch (c) {
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
                    stack.pop();
                    break;
                case ']':
                    stack.pop();
                    break;
                case '}':
                    stack.pop();
                    break;
                default:
                    break;
            }
        }
        if (stack.isEmpty())
            System.out.println("Balanced...");
        else
            System.out.println("Not Balanced...");
    }
}
