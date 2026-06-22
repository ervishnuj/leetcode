public class ConvertOneDArrayInto2DArray {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n!=original.length)return new int[][]{};
        int[][] a=new int[m][n];
        // int len=original.length;
        
        int k=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=original[k++];
            }
        }
        // int k=0;
        // for(int i=0;i<original.length;i++){
        //     a[k][i%n]=original[i];
        //     if(k<i*n){
                
        //     }
        // }
        return a;
    }
}
