class NumberOfArithmeticTriplets {
    public int arithmeticTriplets(int[] nums, int diff) {
        int res=0;
        // int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(Integer i:nums){
            set.add(i);
        }
        for(Integer i:nums){
            if( set.contains(i-diff)&&set.contains(diff+i))res++;
        }
        return res;
    }
}
