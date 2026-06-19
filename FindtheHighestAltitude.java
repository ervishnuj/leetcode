public class FindtheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        if(n==1)return 0>gain[0]?0:gain[0];
        int max=0;
        int curr=0;
        for(int i=0;i<n;i++){
            curr+=gain[i];
            if(curr>max)max=curr;
        }
        return max;
    }
}
