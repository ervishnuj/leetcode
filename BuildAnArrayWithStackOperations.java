import java.util.ArrayList;
import java.util.List;

public class BuildAnArrayWithStackOperations {
    public List<String> buildArray(int[] target, int n) {
        List<String> al =new ArrayList<>();
        int res=1;
        int len=target.length;
        for(int i=0;i<len;i++,res++){
            while(res<target[i]){
                al.add("Push");
                al.add("Pop");
                res++;
            }
            al.add("Push");
            
        }
        return al;
    }
}
