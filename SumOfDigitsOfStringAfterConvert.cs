public class SumOfDigitsOfStringAfterConvert {
    public int GetLucky(string s, int k) {
        // HashMap<Character,Integer> map=new HashMap<>();
        string sb="";
        foreach(char c in s){
            sb+=c-'a'+1;
        }
        Console.WriteLine(sb);
        string ss=sb;
        while(k-->0){
            ss=characterSum(ss);
        }
        int res=0;
        int i=0;
        while(ss.Length>i++){
            res*=10;
            res+=ss[i-1]-'0';
        }
        // return ss.charAt(0)-'0';
        return res;
    }
    private string characterSum(string sb){
        int res=0;
        foreach(char c in sb){
            res+=c-'0';
        }
        return res+"";

    }
}
