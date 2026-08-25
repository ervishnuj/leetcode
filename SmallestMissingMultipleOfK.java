class SmallestMissingMultipleOfK{
  public int missingMultiple(int[] nums, int k) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(Integer i:nums){
            set.add(i);
        }
        for(int i=1;i<=n;i++){
            if(!set.contains(i*k))return i*k;
        }
        return (n+1)*k;
    }
}
