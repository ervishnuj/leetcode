public class MaximumDifferenceBetweenIncreasingElements {
    public int maximumDifference(int[] nums) {
        int max = -1;
        int min = nums[0];
        int len = nums.length;
        for (int i = 1; i < len; i++) {
            if (min < nums[i]) {
                max = Math.max(max, nums[i] - min);
            } else {
                min = nums[i];
            }
        }
        return max;
        // // int i=0;
        // int len=nums.length;
        // // int j=len-1;

        // int max=0;
        // for(int i=0;i<len;i++){
        // for(int j=i+1;j<len;j++){
        // if(max<(nums[j]-nums[i]))max=nums[j]-nums[i];
        // }
        // }
        // // while(i<j){
        // // if(max<(nums[j]-nums[i])){
        // // max=(nums[j]-nums[i]);
        // // }
        // // // if(nums[j]<nums[i]){
        // // j--;
        // // // }

        // // i++;
        // // }
        // return max!=0?max:-1;
        // while(j<len){
        // if(nums[i]>nums[j]){
        // i=j;
        // }else{

        // }
        // }
    }
}
