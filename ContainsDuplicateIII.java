import java.util.TreeSet;

public class ContainsDuplicateIII {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        TreeSet<Long> arr=new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            Long ceil=arr.ceiling((long)nums[i]-valueDiff);
            if(ceil!=null&&ceil<=(long)nums[i]+valueDiff){
                return true;
            }
            arr.add((long)nums[i]);
            if(i>=indexDiff){
                arr.remove((long)nums[i-indexDiff]);
            } 
        }
        return false;
        //--------------brute force------------------------------
        // ArrayList<Integer> arr=new ArrayList<>();
        //  for(int i=0;i<nums.length;i++){
        //     if(arr.size()!=0){
        //         for(int x:arr){
        //             if(Math.abs(x-nums[i])<=valueDiff)return true;
        //         }
        //     }
        //     if(arr.size()==indexDiff){
        //         arr.remove(0);
        //     }
        //     arr.add(nums[i]);
            
        // }
        // return false;
    }
}
