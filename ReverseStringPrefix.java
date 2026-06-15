class ReverseStringPrefix {
    public String reversePrefix(String s, int k) {
        char[] ch=s.toCharArray();
        int left=0;
        // if(k==s.length())k-=1;
        int right=k-1;
        
        while(left<right){
            char c=ch[left];
            ch[left]=ch[right];
            ch[right]=c;
            left++;
            right--;
        }
        return new String(ch);
    }
}
