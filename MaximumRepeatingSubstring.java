public class MaximumRepeatingSubstring {
    public int maxRepeating(String sequence, String word) {

        StringBuilder st = new StringBuilder(word);
        int count = 0;
        while (sequence.contains(st.toString())) {
            count++;
            st.append(word);
        }
        return count;
    }
}
