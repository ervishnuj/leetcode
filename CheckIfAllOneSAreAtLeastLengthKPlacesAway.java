public class CheckIfAllOneSAreAtLeastLengthKPlacesAway {
    public boolean kLengthApart(int[] nums, int k) {
        
        int n=nums.length;
        int j=-n-1;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                System.out.println("subtract : "+(i-j));
                if((i-j)<=k)return false;
                j=i;
                System.out.println(j);
            }
        }
        return true;
    }
}
