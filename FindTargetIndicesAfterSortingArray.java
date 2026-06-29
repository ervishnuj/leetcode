import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndicesAfterSortingArray {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]==target)al.add(i);
        }
        return al;
    }
}
