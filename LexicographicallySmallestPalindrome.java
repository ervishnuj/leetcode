class LexicographicallySmallestPalindrome {
    public String makeSmallestPalindrome(String s) {
        int diff=0;
        int len=s.length();
        int index=0;
        char[] ch=s.toCharArray();
        for(int i=0;i<=len/2;i++){
            if(s.charAt(i)!=s.charAt(len-i-1)){
                diff=0;
                index=i;
                if(s.charAt(i)>s.charAt(len-i-1))
                ch[i]=s.charAt(len-i-1);
                else ch[len-i-1]=s.charAt(i);
            }
            // if(diff>1)return false
        }
        return new String(ch);
    }
}
