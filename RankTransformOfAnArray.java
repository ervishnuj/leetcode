import java.util.HashMap;
import java.util.TreeSet;

public class RankTransformOfAnArray {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
            // map.put(arr[i],i+1);
        }
        int index = 1;
        for (Integer i : set) {
            map.put(i, index++);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}
