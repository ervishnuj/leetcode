class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] mat) {
        int row=mat.length;
        int col=mat[0].length;
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(i!=0&&j!=0&&mat[i][j]!=mat[i-1][j-1]){
                    return false;
                }
            }
        }
        return true;
    }
}
