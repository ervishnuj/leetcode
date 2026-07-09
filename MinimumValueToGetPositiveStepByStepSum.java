public class MinimumValueToGetPositiveStepByStepSum {
    public int minStartValue(int[] nums) {

        int sum = 0;
        int min = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (min > sum)
                min = sum;
        }
        if (min == 0)
            return 1;
        return Math.abs(min) + 1;
        // working code
        // ArrayList<Integer> prefix=new ArrayList<>();
        // // prefix.add(nums[0]);
        // // int sum=nums[0];
        // for(int i=1;i<nums.length;i++){
        // prefix.add(nums[i]+prefix.get(i-1));
        // }
        // for(int i=0;i<nums.length;i++){
        // System.out.println(prefix.get(i));
        // }
        // int min=0;
        // for(int i=0;i<nums.length;i++){
        // if(prefix.get(i)<min)min=prefix.get(i);
        // }
        // if(min==0)return 1;
        // return Math.abs(min)+1;

        // int min=0;int max=0;
        // for(int i=0;i<nums.length;i++){
        // if(nums[i]>0)max+=nums[i];
        // else min+=nums[i];
        // }
        // if(min==0)return 1;
        // else if(min+max==0){
        // return max-1;
        // }else if((min+max)>0)return Math.abs(min)-1;

        // ArrayList<Integer> prefix=new ArrayList<>();
        // prefix.add(nums[0]);
        // for(int i=1;i<nums.length;i++){
        // prefix.add(num[i]+prefix.get(i-1));
        // }
        // for(int i=prefix.size()-1;i>=0;i--){
        // if(prefix.get(i)<1){
        // if()
        // }
        // }

    }
}
