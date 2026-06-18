import java.util.ArrayList;
import java.util.List;

public class AddToArrayFormOfInteger {
     public List<Integer> addToArrayForm(int[] nums, int k) {
        List<Integer> al=new ArrayList<>();
        for(int i=nums.length-1;i>=0;i--){
            k+=nums[i];
            al.add(0,k%10);
            if(k>0){
                k/=10;
            }
            
        }
        while(k>0){
            al.add(0,k%10);
            k/=10;
        }
        
        return al;
    }
}
