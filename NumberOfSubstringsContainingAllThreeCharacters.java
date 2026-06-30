public class NumberOfSubstringsContainingAllThreeCharacters {
     public int numberOfSubstrings(String s) {
        int n=s.length();
        int ans=0;
        int left=0;
        // int a=0,b=0,c=0;
        int[] abc=new int[3];
        for(int right=0;right<n;right++){
            abc[s.charAt(right)-'a']++;
            while(abc[0]>0&&abc[1]>0&&abc[2]>0){
                ans+=n-right;
                abc[s.charAt(left)-'a']--;
                left++;
            }
        }
        return ans;
        
    }
}
