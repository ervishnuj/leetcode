class SplitWithMinimumSum {
    public int splitNum(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        // Sort digits in ascending order
        Arrays.sort(digits);

        int num1 = 0;
        int num2 = 0;

        // Alternately distribute digits to num1 and num2
        for (int i = 0; i < digits.length; i++) {
            int digitValue = digits[i] - '0';
            if (i % 2 == 0) {
                num1 = num1 * 10 + digitValue;
            } else {
                num2 = num2 * 10 + digitValue;
            }
        }
        return num1 + num2;
    }
}
