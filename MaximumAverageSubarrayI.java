public class MaximumAverageSubarrayI{
public double findMaxAverage(int[] nums, int k) {
        double result=Double.NEGATIVE_INFINITY;
        int addedValue=0;
        for(int i=0;i<nums.length;i++){
            addedValue+=nums[i];
            if(i>=k)addedValue-=nums[i-k];
            if(i>=k-1&&result<((double)addedValue/(double)k)){
                result=((double)addedValue/(double)k);
            }
        }
        return result;
    }
}
