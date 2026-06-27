public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        // ArrayList<Integer> al=new ArrayList<>();
        int a=0;
        int[] arr=new int[n];
        long res=1;

        for(int i=0;i<n;i++){
            if(nums[i]==0)a++;
            // al.add(0);
            else
            res*=nums[i];

        }
        for(int i=0;i<n;i++){
            
            if(nums[i]==0&&a==1){//al.size()==1
                nums[i]=(int)res;
            }else if(a>0){//al.size()
                nums[i]=0;
            }else
            nums[i]=(int)res/nums[i];
        }
        return nums;
    }
}
