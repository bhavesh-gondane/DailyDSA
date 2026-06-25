import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {

    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='('||c=='['||c=='{'){
                stack.push(c);
            } else if (c==')'||c==']'||c=='}') {
                if (stack.isEmpty()){
                    return false;
                }
                char ch = stack.pop();
                if(c==')'&&ch!='('||
                c=='}'&&ch!='{'||
                c==']'&&ch!='['){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
