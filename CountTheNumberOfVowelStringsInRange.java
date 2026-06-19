public class CountTheNumberOfVowelStringsInRange {
    public int vowelStrings(String[] words, int left, int right) {
        int res=0;
        for(int i=left;i<=right;i++){
            if(valid(words[i]))res++;
        }
        return res;
    }
    private boolean valid(String s){
        char[] ch={'a','e','i','o','u'};
        char c1=s.charAt(0);
        char c2=s.charAt(s.length()-1);
        boolean fir=false;
        boolean sec=false;
        for(int i=0;i<5;i++){
            if(c1==ch[i]){fir=true;}
            if(c2==ch[i]){sec=true;}
        }
        return fir&sec;
    }
}
