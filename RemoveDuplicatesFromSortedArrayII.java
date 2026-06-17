class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {

        int res=0;
        ArrayList<Integer> al=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(;left<n&&right<n;){
            // map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])<3){
                // res++;
                nums[inc++]=nums[i];
                // al.add(nums[i]);
            }
        }
        
                
        int inc=0;
        int n=nums.length;
        // int res=0;
        // ArrayList<Integer> al=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])<3){
                // res++;
                nums[inc++]=nums[i];
                // al.add(nums[i]);
            }
        }
        
        return inc;
    }
}
