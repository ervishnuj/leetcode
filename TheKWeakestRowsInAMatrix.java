import java.util.ArrayList;

public class TheKWeakestRowsInAMatrix {
    public int[] kWeakestRows(int[][] mat, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        int m = mat.length;
        int n = mat[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    al.add(j);
                    break;
                } else if (j + 1 == n) {
                    al.add(j + 1);
                }
            }
        }
        // for(Integer i:al){
        // System.out.println(i);
        // }
        int[] res = new int[k];
        int size = al.size();
        // int min=Integer.MAX_VALUE;
        for (int i = 0; i < size && i < k; i++) {
            int index = 0;
            int inc = 0;
            while (inc < size) {
                if (al.get(index) > al.get(inc)) {
                    index = inc;
                }
                inc++;
            }
            res[i] = index;
            al.remove(index);
            al.add(index, Integer.MAX_VALUE);

        }
        return res;
    }
}
