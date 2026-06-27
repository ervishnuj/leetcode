import java.util.List;

public class SnakeInMatrix {
    public int finalPositionOfSnake(int n, List<String> commands) {
        // int grid[][]=new int[n][n];
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         grid[i][j]=(i*n)+j;
        //     }
        // }
        int i=0;int j=0;
        for(String s:commands){
            switch(s){
                case "DOWN":
                    i++;
                    break;
                case "UP":
                    i--;break;
                case "LEFT":
                    j--; break;
                case "RIGHT":
                    j++;
            }
        }
        // return grid[i][j];
        return (i*n)+j;
    }
}
