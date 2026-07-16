public class SumOfTwoIntegers {
    public int getSum(int a, int b) {
        // return a+b;
        int xor = a ^ b;
        int carry = (a & b) << 1;
        if (carry != 0) {
            return getSum(xor, carry);
        }
        return xor;
    }
}
