import java.util.HashMap;

public class CountNumberOfPairsWithAbsoluteDifferenceK {
    public int countKDifference(int[] nums, int k) {
        // HashMap<Integer,Integer> map=new HashMap<>();
        // int len=nums.length;
        // int res=0;
        // for(int i=0;i<len;i++){
        // if(map.containsKey(k+nums[i])){
        // // res+=map.get(k+nums[i]);
        // res+=1;
        // System.out.println("Inside Res: "+res);
        // }
        // map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // System.out.println(nums[i]+" : "+map.get(nums[i]));
        // System.out.println("Res: "+res);
        // }
        // return res;
        // int size=nums.length;
        // int res=0;
        // for(int i=0;i<size;i++){
        // for(int j=i+1;j<size;j++){
        // if(Math.abs(nums[i]-nums[j])==k){
        // res++;
        // }
        // }
        // }
        // return res;
        HashMap<Integer, Integer> map = new HashMap<>();
        // int len = nums.length;
        int res = 0;
        for (Integer num : nums) {
            res += map.getOrDefault(num - k, 0);
            res += map.getOrDefault(k + num, 0);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return res;
    }
}
