public class CellswithOddValuesInAMatrix {
     public int oddCells(int m, int n, int[][] indices) {
        int[] row=new int[m];
        int[] col=new int[n];
        for(int[] a:indices){
            row[a[0]]++;
            col[a[1]]++;
        }
        int res=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((row[i]+col[j])%2==1)res++;
            }
        }
        return res;
        // int a[][]=new int[m][n];
        // int x=indices.length;
        // // int y=indices[0].length;

        // for(int i=0;i<x;i++){
        //     int row=indices[i][0];
        //     int col=indices[i][1];
        //     for (int j = 0; j < n; j++) {
        //         a[row][j]++;
        //     }

           
        //     for (int c = 0; c < m; c++) {
        //         a[c][col]++;
        //     }
        //     // int c=0;
        //     // while(c<m&&c<n){
        //     //     a[row][c]++;
        //     //     a[c][col]++;
        //     //     c++;
        //     // }
        //     // while(c<m){
        //     //     a[row][c]++;
        //     //     c++;
        //     // }
        //     // while(c<n){
        //     //     System.out.println(c);
        //     //     a[c][col]++;
        //     //     c++;
        //     // }
        // }
        // int res=0;  
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         if(a[i][j]%2==1)res++;
        //     }
        // }
        // return res;
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         a[i][j]++;
        //     }
        // }

    }
}
