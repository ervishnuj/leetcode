public class WaterBottles {
     public int numWaterBottles(int numBottles, int numExchange) {
        int res=numBottles;
        if((numBottles<numExchange))return res;
        int bal=0;
        while((numBottles+bal)>=numExchange){
            int temp=(numBottles+bal)/numExchange;
            res+=temp;
            bal=(numBottles+bal)%numExchange;
            numBottles=temp;
        }
        return res;
    }
}
