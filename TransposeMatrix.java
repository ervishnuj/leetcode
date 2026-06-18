class TransposeMatrix {
    public int[][] transpose(int[][] m) {
        int row=m.length;
        int col=m[0].length;
        int[][] arr=new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[j][i]=m[i][j];
            }
        }
        return arr;
    }
}
