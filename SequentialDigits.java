import java.util.ArrayList;
import java.util.List;

public class SequentialDigits {
    public List<Integer> sequentialDigits(int low, int high) {
        String digits = "123456789";
        List<Integer> ans = new ArrayList<>();
        int start = ((int) Math.log10(low) + 1);
        int end = (int) Math.log10(high) + 1;
        System.out.println(start);
        System.out.println(end);
        for (int i = start; i <= end; i++) {
            System.out.println(i);
            for (int j = 0; j <= 9 - i; j++) {
                int temp = Integer.parseInt(digits.substring(j, j + i));
                System.out.println(temp);
                if (temp >= low && temp <= high) {
                    ans.add(temp);
                }
            }
        }
        return ans;
    }
}
