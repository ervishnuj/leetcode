import java.util.ArrayList;
import java.util.Collections;

public class SortEvenAndOddIndicesIndependently {
    public int[] sortEvenOdd(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> odd=new ArrayList<>();
        ArrayList<Integer> even=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i%2==0)even.add(nums[i]);
            else odd.add(nums[i]);
        }
        Collections.sort(even);
        Collections.sort(odd);
        int e=0;
        int o=odd.size()-1;
        for(int i = 0; i < n; i++) {
            if(i % 2 == 0)
                nums[i] = even.get(e++);
            else
                nums[i] = odd.get(o--);
        }
        
        return nums;
    }
}
