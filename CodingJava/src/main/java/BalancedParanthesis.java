import java.util.Stack;

/**
 * Created by Bilna on 04-07-2017.
 */
public class BalancedParanthesis {
    public static void main(String[] args) {
        String s = "[(({}{]})())";
        method1(s);
    }

    /*
        Using Stack
     */
    public static void method1(String s) {
        boolean isContinue = true;
        Stack<Character> stack = new Stack<Character>();
        if (s == null || s.length() == 0) {
            System.out.println("Balanced...");
        }
        for (int i = 0; (i < s.length()) & isContinue; i++) {
            switch (s.charAt(i)) {
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
                    if (!stack.isEmpty()&stack.peek()=='(') {
                        stack.pop();
                    } else {
                        isContinue = false;
                    }
                    break;
                case ']':
                    if (!stack.isEmpty()&stack.peek()=='[') {
                        stack.pop();
                    } else {
                        isContinue = false;
                    }
                    break;
                case '}':
                     if(!stack.isEmpty()&stack.peek()=='{'){
                        stack.pop();
                    }else{
                        isContinue=false;
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
