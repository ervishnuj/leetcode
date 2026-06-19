public class CountPrefixesOfAGivenString {
    public int countPrefixes(String[] words, String s) {
        int res =0;
        for(String st:words){
            if(isContains(s,st)){
                res++;
            }
        }
        return res;
    }
    private boolean isContains(String s,String ref){
        int len=ref.length();
        int slen=s.length();
        if(slen<len)return false;
        for(int i=0;i<len;i++){
            
            if(s.charAt(i)!=ref.charAt(i))return false;
        }
        return true;
    }
}
