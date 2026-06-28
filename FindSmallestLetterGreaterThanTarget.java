public class FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        int ch=target-'a';
        int n=letters.length;
        int first=-1;
        for(int i=0;i<n;i++){
            int c=letters[i]-'a';
            if(ch<c&&(first==-1||first>c)){
                first=c;
                return (char)(first+'a');
            }
        }
        // return first!=-1?(char)(first+'a'):letters[0];
        return letters[0];
    }
}
