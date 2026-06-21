public class DecodeXORedArray {
    public int[] decode(int[] encoded, int first) {
        int n=encoded.length;
        int[] arr=new int[n+1];
        arr[0]=first;
        for(int i=0;i<n;i++){
            arr[i+1]=arr[i]^encoded[i];
        }
        
        return arr;
        // ArrayList<Integer> al=new ArrayList<>();
        // al.add(first);
        // int n=encoded.length;
        // for(int i=0;i<n;i++){
        //     al.add(al.get(al.size()-1)^encoded[i]);
        // }
        // int[] arr=new int[al.size()];
        // int i=0;
        // for(Integer a:al){
        //     arr[i++]=a;
        // }
        // return a;
    }
    
}
