class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int m=mat.length;
        int n=mat[0].length;

        for(int i=0;i<n;i++){
          
            sum += mat[i][i];
            
            if (i != n - 1 - i) {
                sum += mat[i][n - 1 - i];
            }
        }
        return sum;
    }
}
