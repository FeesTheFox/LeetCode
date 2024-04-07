import java.util.Stack;

public class ParenthesisString {
    public boolean checkValidString(String s) {
        Stack<Integer>bracketsSt = new Stack<>();
        Stack<Integer>asteriskSt = new Stack<>();

        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++){
            char ch = c[i];
            if (ch == '('){
                bracketsSt.push(i);
            }else if (ch == '*') {
                asteriskSt.push(i);
            }else if (!bracketsSt.isEmpty()) {
                bracketsSt.pop();
            }else if (!asteriskSt.isEmpty()) {
                asteriskSt.pop();
            }else {
                return false;
            }
        }
        while (!bracketsSt.isEmpty() && !asteriskSt.isEmpty() && bracketsSt.peek()<asteriskSt.peek()){
            bracketsSt.pop();
            asteriskSt.pop();
        }

        return bracketsSt.isEmpty();
    }
}
