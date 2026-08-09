class CountLargestGroup {
    public int countLargestGroup(int n) {
        int[] groupSizes = new int[37];
        int maxGroupSize = 0;

        // Group elements from 1 to n
        for (int i = 1; i <= n; i++) {
            int sum = getDigitSum(i);
            groupSizes[sum]++;
            maxGroupSize = Math.max(maxGroupSize, groupSizes[sum]);
        }

        // Count how many groups share the maximum size
        int count = 0;
        for (int size : groupSizes) {
            if (size == maxGroupSize) {
                count++;
            }
        }

        return count;
}
private int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
}
}
