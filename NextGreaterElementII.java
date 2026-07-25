class NextGreaterElementII {
    public int[] nextGreaterElements(int[] nums) {
       
        int n = nums.length;
        int[] result = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        // Traverse from right to left
        for (int i =2* n - 1; i >= 0; i--) {
            int index=i%n;
            // Pop elements that are smaller than or equal to current element
            while (!stack.isEmpty() && stack.peek() <= nums[index]) {
                stack.pop();
            }

            // If stack is empty, no greater element on the right
            if(i<n)
            result[i] = stack.isEmpty() ? -1 : stack.peek();

            // Push current element for left side elements to evaluate
            stack.push(nums[index]);
        }

        return result;
    }
}
