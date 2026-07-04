public class CalculateMoneyInLeetcodeBank {
    public int totalMoney(int n) {
        int week = n / 7;
        int intialWeek = 4;
        int startingPoint = 1;
        int res = 0;
        while (week-- > 0) {
            res += intialWeek * 7;
            startingPoint++;
            intialWeek++;
        }
        int balance = n % 7;
        while (balance-- > 0) {
            res += startingPoint++;
        }
        return res;
    }
}
