public class FlipSquareSubmatrixVertically {
      public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
       
        int len=grid.length;
        for(int i=0;i<(k/2);i++){
            for(int j=0;j<k;j++){
                int temp=grid[i+x][j+y];
                grid[i+x][j+y]=grid[x+k-i-1][j+y];
                grid[x+k-i-1][j+y]=temp;
            }
        }
        return grid;
        
    }
}
