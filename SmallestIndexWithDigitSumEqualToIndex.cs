public class SmallestIndexWithDigitSumEqualToIndex {
    public int SmallestIndex(int[] nums) {
        for(int i=0;i<nums.Length;i++){
            if (Sum(nums[i]) == i) {
                return i; // First match is the smallest index
            }
            // if (i % 10 == nums[i]) {
            //     return i; // First match is guaranteed to be the smallest index
            // }
        //     if(nums[i]==i)return i;
        //     else if(nums[i]>9){
        //         // int res=Sum(nums[i]);
        //         int res=0;
        //         int value=nums[i];
        // while(value>0){
        //     res+=value%10;
        //     value/=10;
        // }
        //         if(res==i)return i;
        //     }
        }
        return -1;
    }
    public int Sum(int value){
        int res=0;
        while(value>0){
            res+=value%10;
            value/=10;
        }
        // if(res>9){
        //     res=Sum(res);
        // }
        // Console.WriteLine(res);
        return res;
    }
}
