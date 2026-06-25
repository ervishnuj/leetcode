import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        int len=arr.length;
        for(int i=1;i<len;i++){
            if(min>arr[i]-arr[i-1]){
                min=arr[i]-arr[i-1];
            }
        }
        List<List<Integer>> res=new ArrayList<>();
        for(int i=1;i<len;i++){
            List<Integer> al=new ArrayList<>();
            if(min==arr[i]-arr[i-1]){
                al.add(arr[i-1]);
                al.add(arr[i]);
                
                res.add(al);
            }
        }
        return res;
    }
}

