using System.Collections.Generic;
public class FindMissingAndRepeatedValues {
    public int[] FindMissingAndRepeatedValues(int[][] grid) {
        // return new int[]{2,4};
        int[] res=new int[2];
        HashSet<int> set=new HashSet<int>();
        for(int i=0;i<grid.Length;i++){
            for(int j=0;j<grid[0].Length;j++){
                if(set.Contains(grid[i][j])){
                    res[0]=grid[i][j];
                }
                set.Add(grid[i][j]);
            }
        }
        for(int i=1;i<=grid[0].Length*grid.Length;i++){
            if(!set.Contains(i))res[1]=i;
        }
        return res;
    }
}
