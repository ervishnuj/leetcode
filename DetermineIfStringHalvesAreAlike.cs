public class DetermineIfStringHalvesAreAlike {
    public bool HalvesAreAlike(string s) {
        int left=0;
        int right=s.Length-1;
        HashSet<char> set=new HashSet<char>(){'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int leftVowelCount=0,rightVowelCount=0;
        while(left<=right){
            if(set.Contains(s[left]))leftVowelCount++;
            if(set.Contains(s[right]))rightVowelCount++;
            left++;
            right--;
        }
        return leftVowelCount==rightVowelCount;
    }
}
