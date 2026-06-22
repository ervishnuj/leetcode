public class MinimumAmountOfTimeToFillCups {
     public int fillCups(int[] amount) {
        
        if(amount[0]==0&&amount[1]==0&&amount[2]==0)return 0;
        int total=amount[0]+amount[1]+amount[2];
        int max=Math.max(amount[0],Math.max(amount[1],amount[2]));
        return Math.max(max,(total+1)/2);
        
    }
}
