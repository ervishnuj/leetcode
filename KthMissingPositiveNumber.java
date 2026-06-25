public class KthMissingPositiveNumber {
     public int findKthPositive(int[] arr, int k) {
        
        //----------------------two pointer technic-----------------
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(right+left)/2;
            if(arr[mid]-(mid+1)<k){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return k+right+1;

        //-----------------------------Brute force technic---------------------
        // Set<Integer> set=new HashSet<>();
        // int n=arr.length;
        // for(int i=0;i<n;i++){
        //     set.add(arr[i]);
        // }
        // ArrayList<Integer> res=new ArrayList<>();
        // // int j=0;
        // for(int i=0;i<arr[n-1];i++){
        //     if(!set.contains(i)){
        //         // j++;
        //         res.add(i);
        //     }
        // }
        // for(int i=res.size(),j=arr[n-1]+1;i<=k+1;i++,j++){
        //     res.add(j);
        // }
        // for(int i:res)System.out.println(i);
        // return res.get(k);
    }
}
