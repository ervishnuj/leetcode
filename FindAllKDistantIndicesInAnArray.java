class FindAllKDistantIndicesInAnArray {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            if(nums[i]==key){
                int left=(i-k)<=0?0:i-k;
                int right=(i+k)>=n?n-1:i+k;
                while(left<=right){
                    set.add(left++);
                }
            }
        }
        List<Integer> al=new ArrayList<>();
        for(int i:set){
            al.add(i);
        }
        Collections.sort(al);
        return al;
    }
}
