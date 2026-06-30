public class RemovePalindromicSubsequences {
    public int removePalindromeSub(String s) {
        if(s.length()==0)return 0;
        int leftSide=0;int rightSide=s.length()-1;
        while(leftSide<rightSide){
            if(s.charAt(leftSide)!=s.charAt(rightSide))return 2;
            leftSide++;
            rightSide--;
        }
        return 1;
    }
}
