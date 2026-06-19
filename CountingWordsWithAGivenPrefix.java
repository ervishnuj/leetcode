public class CountingWordsWithAGivenPrefix {
    public int prefixCount(String[] words, String pref) {
        int res =0;
        for(String s:words){
            if(isContains(s,pref)){
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
