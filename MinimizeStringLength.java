public class MinimizeStringLength {
     public int minimizedStringLength(String s) {
        boolean b[]=new boolean[26];
        int n=s.length();
        for(int i=0;i<n;i++){
            int num=s.charAt(i)-'a';
            b[num]=true;
                        
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(b[i])count++;
        }
        return count;
    }
}
