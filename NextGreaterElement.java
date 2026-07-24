class NextGreaterElement {
    public int[] nextGreaterElements(int[] nums) {
        // int len=nums.length;
        // int[] arr=new int[len];
        // Deque<Integer> da=new ArrayDeque<>();
        // for(int i=len-1;i>=0;i--){
        //     while(!da.isEmpty()&&da.peek()<=nums[i]){
        //         da.pop();
        //     }
        //     arr[i]=da.isEmpty()?-1:da.peek();
        //     da.push(nums[i]);
        // }
        // return arr;
        int n = nums.length;
        int[] result = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Pop elements that are smaller than or equal to current element
            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }

            // If stack is empty, no greater element on the right
            result[i] = stack.isEmpty() ? -1 : stack.peek();

            // Push current element for left side elements to evaluate
            stack.push(nums[i]);
        }

        return result;
    }
}
