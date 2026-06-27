import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingElements {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> result =new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=1;i<n;i++){
            int j=1;
            while(nums[i-1]+j!=nums[i]){
                result.add(nums[i-1]+j++);
            }
        }
        return result;
    }
}
