import java.util.HashMap;

public class ThreeSumWithMultiplicity {
    public int threeSumMulti(int[] arr, int target) {
        int n=arr.length;
        // if(k>n)
        // int k=n-1;
        int res=0;
        int MOD = 1_000_000_007;
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<n;i++){
        //     map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        // }
        for(int i=0;i<n;i++){
            // int first=arr[i];
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int j=i+1;j<n;j++){
                int needed=target-(arr[i]+arr[j]);
                if(map.containsKey(needed)){
                    res=(res+map.get(needed))%MOD;
                }
                map.put(arr[j],map.getOrDefault(arr[j],0)+1);
            }
        }
        return res;
    }
}
