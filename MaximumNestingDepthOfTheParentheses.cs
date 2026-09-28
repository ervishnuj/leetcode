public class MaximumNestingDepthOfTheParentheses {
    public int MaxDepth(string s) {
        int res=0;
        Stack<int> st=new Stack<int>();
        foreach(char c in s){
            if(c=='(')st.Push(1);
            else if(c==')')st.Pop();
            if(st.Count>res) res=st.Count;
        }
        return res;
    }
}
