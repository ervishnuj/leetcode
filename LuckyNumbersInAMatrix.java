import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersInAMatrix {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int n=matrix[0].length;
        int m=matrix.length;
        List<Integer> res=new ArrayList<>();
        int x=0;
        for(int i=0;i<m;i++){
            int min=matrix[i][0];

            int col=0;
            for(int k=1;k<n;k++){
                if(min>matrix[i][k]){
                    min=matrix[i][k];
                    col=k;
                }
            }
            
            boolean lucky=true;
            for(int j=0;j<m;j++){
                if(matrix[j][col]>min){
                    lucky=false;
                    break;
                }
            }
            if(lucky){
                res.add(min);
            }
        }

        return res;
    }
}
