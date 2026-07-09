public class DecompressRunLengthEncodedList {
    public int[] decompressRLElist(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i += 2) {
            count += nums[i];
            // int times=nums[i];
            // while(times-->0){
            // al.add(nums[i+1]);
            // }
        }
        int a[] = new int[count];
        int index = 0;
        for (int i = 0; i < nums.length; i += 2) {
            int times = nums[i];

            while (times-- > 0) {
                // al.add(nums[i+1]);
                a[index++] = nums[i + 1];
            }
            // index+=nums[i]-1;
        }
        return a;
        // ArrayList<Integer> al=new ArrayList<>();
        // for(int i=0;i<nums.length;i+=2){
        // int times=nums[i];
        // while(times-->0){
        // al.add(nums[i+1]);
        // }
        // }
        // // return nums;
        // // Integer[] res=new Integer[al.size()];
        // // res=al.toArray();
        // // working code
        // int[] res=al.stream().mapToInt(Integer::intValue).toArray();
        // // al.toArray(new int[al.size()]);
        // return res;

        // return IntStream.iterate(0, i -> i < nums.length, i -> i + 2) // Step by 2
        // loops (i = 0, 2, 4...)
        // .flatMap(i -> IntStream.generate(() -> nums[i + 1]).limit(nums[i])) //
        // Generates nums[i+1] repeated nums[i] times
        // .toArray();
    }
}
