import java.util.HashMap;
import java.util.Map;

public class CountCommonWordsWithOneOccurrence {
    public int countWords(String[] words1, String[] words2) {
        int n1=words1.length;
        int n2=words2.length;
        Map<String,Integer> map=new HashMap<>();
        Map<String,Integer> map1=new HashMap<>();
        for(int i=0;i<n1;i++){
            map.put(words1[i],map.getOrDefault(words1[i],0)+1);
        }
        for(int i=0;i<n2;i++){
            map1.put(words2[i],map1.getOrDefault(words2[i],0)+1);
        }
        int count=0;
        for(int i=0;i<n2;i++){
            if(map.getOrDefault(words2[i],0)==1&&map1.getOrDefault(words2[i],0)==1)count++;
        }
        return count;
    }
}
