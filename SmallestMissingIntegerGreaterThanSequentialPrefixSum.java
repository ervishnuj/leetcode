class SmallestMissingIntegerGreaterThanSequentialPrefixSum {
    public int missingInteger(int[] nums) {
         int prefixSum = nums[0];

        // Step 1: Find the sum of the longest sequential prefix
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                prefixSum += nums[i];
            } else {
                break; // Sequential pattern breaks
            }
        }

        // Step 2: Store elements in a HashSet for O(1) lookup
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        // Step 3: Find the smallest missing integer >= prefixSum
        int x = prefixSum;
        while (set.contains(x)) {
            x++;
        }

        return x;
    }
}
