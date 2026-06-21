public class CountTheNumberOfConsistentStrings {
    boolean b[]=new boolean[26];
        int res=0;
        for(Character ch:allowed.toCharArray()){
            b[ch-'a']=true;
        }
        for(int i=0;i<words.length;i++){
            boolean corr=true;
            for(int j=0;j<words[i].length();j++){
                if(!b[words[i].charAt(j)-'a']){
                    // res++;
                    corr=false;
                    break;
                }
            }
            if(corr)res++;
        }
        return res;
    }
}
