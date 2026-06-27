public class BitwiseOROfEvenNumbersInAnArray {
    public int evenNumberBitwiseORs(int[] nums) {
        int even=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                even|=nums[i];
            }
        }
        return even;
    }
}
