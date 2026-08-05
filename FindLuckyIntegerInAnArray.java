class FindLuckyIntegerInAnArray {
    public int findLucky(int[] arr) {
        // return 3;
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int res=-1;
        for(Integer i:map.keySet()){
            // System.out.println(i+"=="+map.get(i));
            if(map.get(i)==(int)i){
                res=Math.max(i,res);
                
            }
        }
        return res;
    }
}
