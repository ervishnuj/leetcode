import java.util.ArrayList;
import java.util.List;

public class Shift2DGrid {
     public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                // a[i*n+j]=grid[i][j];
                al.add(grid[i][j]);
            }
        }
        while(k-->0){
            al.add(0,al.remove(al.size()-1));
        }
        List<List<Integer>> arr=new ArrayList<>();
        for(int i=0;i<m;i++){
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<n;j++){
                
                list.add(al.remove(0));
            }
            arr.add(list);
        }
        return arr;
        
        
    }
}
