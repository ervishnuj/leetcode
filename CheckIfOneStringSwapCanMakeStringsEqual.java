public class CheckIfOneStringSwapCanMakeStringsEqual {
        public boolean areAlmostEqual(String s1, String s2) {
        int count=0;
        int n=s1.length();
        int fir=-1;int sec=-1;
        // int[] a=new int[26];
        char ch=s1.charAt(0);
        for(int i=0;i<n;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                if(count==0)fir=i;
                if(count==1)sec=i;

                ch=s1.charAt(i);
                count++;
            }
        }
        return (count==0)||(count==2&&s1.charAt(fir)==s2.charAt(sec)&&s1.charAt(sec)==s2.charAt(fir));
    }
}
