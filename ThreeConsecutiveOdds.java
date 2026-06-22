public class ThreeConsecutiveOdds {
    public boolean threeConsecutiveOdds(int[] arr) {
        int i=0;int j=0;
        int n=arr.length;
        while(i<n&&j<n){
            if(arr[j]%2==0){
                while(j<n&&arr[j]%2==0){
                    j++;
                }
                i=j;
            }else if(j-i+1>=3)return true;
            j++;
        }
        return false;
    }
}
