class FindFirstPalindromicStringInTheArray {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            if(findPalindrome(words[i].toCharArray()))return words[i];
        }
        return "";
    }
    private boolean findPalindrome(char[] ch){
        int left=0;int right=ch.length-1;
        while(left<right){
            if(ch[left++]!=ch[right--]) return false;
        }
        return true;
    }
}
