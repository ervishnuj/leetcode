public class TwoOutOfThree {
    public IList<int> TwoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        bool[] seen1 = new bool[101];
        bool[] seen2 = new bool[101];
        bool[] seen3 = new bool[101];

        foreach (int n in nums1) seen1[n] = true;
        foreach (int n in nums2) seen2[n] = true;
        foreach (int n in nums3) seen3[n] = true;

        var result = new List<int>();

        for (int i = 1; i <= 100; i++) {
            int count = (seen1[i] ? 1 : 0) + (seen2[i] ? 1 : 0) + (seen3[i] ? 1 : 0);
            if (count >= 2) {
                result.Add(i);
            }
        }

        return result;
    }
}
