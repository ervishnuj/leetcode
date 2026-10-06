public class MinimumAddToMakeParenthesesValid {
    public int MinAddToMakeValid(string s) {
        int res=0;
        Stack<char> stack=new Stack<char>();
        for(int i=0;i<s.Length;i++){
            if(stack.Count==0&&s[i]==')')res++;
            else if(stack.Count!=0&&s[i]==')')stack.Pop();
            else stack.Push('(');
        }
        return res+stack.Count;
    }
}
