import java.util.HashMap;
import java.util.HashSet;

public class LongestHarmoniousSubsequence {
    public int findLHS(int[] nums) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        HashSet<Integer> set=new HashSet<>();
        for(Integer i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
            set.add(i);
        }
        int res=0;
        for(Integer i:set){
            if(set.contains(i+1)){
                int temp=map.get(i)+map.get(i+1);
                if(res<temp)res=temp;
            }
        }
        return res;
    }
}
