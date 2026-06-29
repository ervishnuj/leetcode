public class SubstringsOfSizeThreeWithDistinctCharacters {
    public int countGoodSubstrings(String s) {
        char[] ch=s.toCharArray();
        int count=0;
        int n=ch.length;
        for(int i=n-3;i>=0;i--){
            if(ch[i]!=ch[i+1]&&ch[i+1]!=ch[i+2]&&ch[i]!=ch[i+2])
                count++;// return i+1;
        }
        return count;
    }
}
