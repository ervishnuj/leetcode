import java .util.*;
class CheckIfStringIsAPrefixOfArray {
    public boolean isPrefixString(String s, String[] words) {
        String word=words[0];
        for(int i=1;i<words.length;i++){
            if(s.equals(word)) return true;
            word=word+words[i];
        }
        return s.equals(word);
    }
}
