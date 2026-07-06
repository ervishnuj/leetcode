import java.util.Stack;

public class ClearDigits {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (c < '0' || c > '9') {
                st.push(c);
            } else if (!st.isEmpty()) {
                st.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}
