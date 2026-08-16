public class MaxLengthSubstringTwoOccurrences {

    public static int maximumLengthSubstring(String s) {
        int[] freq = new int[26];
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            freq[rightChar - 'a']++;

            // Shrink window from the left if current character occurs more than twice
            while (freq[rightChar - 'a'] > 2) {
                char leftChar = s.charAt(left);
                freq[leftChar - 'a']--;
                left++;
            }

            // Update maximum valid substring length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
