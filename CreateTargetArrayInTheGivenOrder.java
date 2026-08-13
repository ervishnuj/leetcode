class CreateTargetArrayInTheGivenOrder{

    public int[] createTargetArray(int[] nums, int[] index) {
        int n=index.length;
        ArrayList<Integer> arr=new ArrayList<>();
        int[] target=new int[n];
        for(int i=0;i<n;i++){
            //target[index[i]]=nums[i];
            arr.add(index[i],nums[i]);
        }
        for(int i=0;i<n;i++){
            target[i]=arr.get(i);
            
        }
        return target;
    }
}