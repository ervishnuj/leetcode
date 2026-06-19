public class GreatestEnglishLetterInUpperAndLowerCase {
    public String greatestLetter(String s) {
        boolean low[]=new boolean [26];
        boolean up[]=new boolean [26];
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch>='a'&&ch<='z'){
                low[ch-'a']=true;
                // if(up[ch-'a'])return (char)('A'+ch-'a')+"";
            }else if(ch>='A'&&ch<='Z'){
                up[ch-'A']=true;
                // if(low[ch-'A'])return (char)('A'+ch-'A')+"";
            }
        }
        // for(int i=0;i<26;i++){
        //     if(low[i]&&up[i])return (char)('A'+i)+"";
        // }
        for(int i=25;i>=0;i--){
            if(low[i]&&up[i])return (char)('A'+i)+"";
        }
        return "";
    }
}
