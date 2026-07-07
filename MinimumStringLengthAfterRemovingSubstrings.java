public class MinimumStringLengthAfterRemovingSubstrings {
    public int minLength(String s) {
        char[] stack = new char[s.length()];
        int top = -1;
        for (int i = 0; i < s.length(); i++) {
            stack[++top] = s.charAt(i);
            if (top > 0) {
                if ((stack[top - 1] == 'A' && stack[top] == 'B') ||
                        (stack[top - 1] == 'C' && stack[top] == 'D')) {
                    top -= 2;
                }
            }
        }
        return top + 1;
    }
}
