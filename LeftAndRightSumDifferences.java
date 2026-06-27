public class LeftAndRightSumDifferences {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int left[]=new int[n];
        int right[]=new int[n];
        int l=nums[0];
        int r=nums[n-1];
        for(int i=1,j=n-2;i<n;i++,j--){
            left[i]=l;
            right[j]=r;
            l+=nums[i];
            r+=nums[j];
        }
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            res[i]=Math.abs(left[i]-right[i]);
        }
        return res;
    }
}
