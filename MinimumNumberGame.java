class MinimumNumberGame {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] n=new int[nums.length];
        for(int i=0;i<nums.length;i+=2){
            n[i]=nums[i+1];
            n[i+1]=nums[i];
        }
        return n;
    }
}
