public class MaximumNumberOfBalloons {
    public int maxNumberOfBalloons(String text) {
        int[] ch=new int[26];
        int n=text.length();
        for(int i=0;i<n;i++){
            char c=text.charAt(i);
            if(c=='b'||c=='a'||c=='l'||c=='o'||c=='n'){
                ch[c-'a']++;
            }
        }
        if(ch['l'-'a']>0)
        ch['l'-'a']/=2;
        else{
            return 0;
        }
        if(ch['o'-'a']>0)
        ch['o'-'a']/=2;
        else{
            return 0;
        }
        return Math.min(Math.min(Math.min(Math.min(ch['b'-'a'],ch['a'-'a']),ch['l'-'a']),ch['o'-'a']),ch['n'-'a']);
    }
}
