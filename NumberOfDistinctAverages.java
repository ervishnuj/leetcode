class NumberOfDistinctAverages {
    public int distinctAverages(int[] nums) {
        if(nums.length==2)return 1;
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        // int res=Integer.MAX_VALUE;
        Set<Double> avg=new HashSet<>();
        int res=0;
        //  System.out.println(res);
        while(left<right){
            double temp=(double)(nums[left++]+nums[right--])/2.0;
            // avg.add((double)(nums[left++]+nums[right--])/2.0);
            avg.add(temp);
            // System.out.println("avg"+temp);
        }
        return avg.size();
    }
}
