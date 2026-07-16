import java.util.HashMap;

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                res += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return res;

        // // return 2;
        // // HashMap<Integer,Integer> map=new HashMap<>();
        // int size=nums.length;
        // int[] prefix=new int[size];
        // int res=0;
        // prefix[0]=nums[0];
        // // map.put(nums[0]-k,1);
        // for(int i=1;i<size;i++){
        // prefix[i]=prefix[i-1]+nums[i];
        // // Integer kbal=prefix[i]-k;
        // // if(map.containsKey(prefix[i])){
        // // res++;
        // // }
        // // map.put(kbal,map.getOrDefault(kbal,0)+1);
        // // map.put(prefix[i],map.getOrDefault(prefix[i],0)+1);
        // }
        // int right=size-1;
        // int left=0;
        // while(left<right){
        // if((prefix[left]+prefix[right])>k){
        // right--;
        // }else if((prefix[left]+prefix[right])<k){
        // left++;
        // }else{
        // res++;
        // left++;
        // right--;
        // }
        // }
        // if(prefix[left]==k||prefix[right]==k)res++;
        // // return res+1;
        // return res;

    }
}
