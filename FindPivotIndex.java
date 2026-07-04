public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        if (n <= 1)
            return 0;
        int[] reversePrefix = new int[n];
        int[] forwardPrefix = new int[n];
        reversePrefix[n - 1] = nums[n - 1];
        forwardPrefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            forwardPrefix[i] = nums[i] + forwardPrefix[i - 1];
            reversePrefix[n - i - 1] = nums[n - i - 1] + reversePrefix[n - i];
        }
        if (reversePrefix[1] == 0)
            return 0;

        for (int i = 1; i < n - 1; i++) {
            // System.out.println(reversePrefix[i+1]+" == "+forwardPrefix[i-1]);
            if (reversePrefix[i] == forwardPrefix[i])
                return i;
        }
        if (forwardPrefix[n - 2] == 0)
            return n - 1;
        return -1;
    }
}
