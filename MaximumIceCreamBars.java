import java.util.Arrays;

class MaximumIceCreamBars {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int n=costs.length;
        int count=0;
        int total=0;
        for(int i=0;i<n;i++){
            if(costs[i]>coins||total>=coins||total+costs[i]>coins)return count;
            total+=costs[i];
            count++;
        }
        return count;
    }
}