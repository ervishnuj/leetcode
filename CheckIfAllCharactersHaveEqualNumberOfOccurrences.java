import java.util.HashMap;
import java.util.Map;

public class CheckIfAllCharactersHaveEqualNumberOfOccurrences {
    public boolean areOccurrencesEqual(String s) {
        char ch[]=s.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        int n=ch.length;
        for(int i=0;i<n;i++){
            map.put(ch[i],map.getOrDefault(ch[i],0)+1);
        }
        int count=map.get(ch[0]);
        for(Integer c:map.values()){
            if(count!=c)return false;
        }
        return true;
    }
}
