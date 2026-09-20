public class ReverseDegreeOfAString {
    public int ReverseDegree(string s) {
        int result=0;
        for(int i=0;i<s.Length;i++){
            result+=('z'-s[i]+1)*(i+1);
            // Console.WriteLine((('z'-s[i]+1))*(i+1));
            // Console.WriteLine(result);
        }
        return result;
    }
}
