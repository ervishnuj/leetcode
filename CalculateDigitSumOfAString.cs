public class CalculateDigitSumOfAString {
    public string DigitSum(string s, int k) {
        while(s.Length>k){
            s=SumValue(s,k);
            Console.WriteLine(s);

        }
        return s;
    }
    string SumValue(string s,int k){
        if(s.Length<=k)return s;
        var res="";
        int value=0;
        for(int i=0;i<s.Length;i++){
            if(i!=0&&i%k==0){
                res+=value;
                value=0;
            }
            value+=s[i]-'0';
            if(i==s.Length-1){
                res+=value;
            }
            // Console.WriteLine(res);
        }
        return res;
    }
}
