public class GCDOfOddAndEvenSums {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 1;
        int sumEven = 2;
        for (int i = 2; i <= n; i++) {
            sumOdd += (i * 2) - 1;
            sumEven += i * 2;
        }
        // System.out.println(sumEven+" "+sumOdd);
        for (int i = sumOdd / 2; i > 1; i--) {
            // System.out.println(i);
            if (sumOdd % i == 0 && sumEven % i == 0)
                return i;
        }
        return 1;
    }
}
