public class DistanceBetweenBusStops {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        // return 1;
        int starting=0;
        int end=0;
        if(start>destination){
            starting=destination;
            end=start;
        }else{
            starting=start;
            end=destination;
        }
        int res=0;
        for(int i=starting;i<end;i++){
            res+=distance[i];
        }
        int res2=0;
        for(int i=end;i<distance.length;i++){
            res2+=distance[i];
        }
        if(starting>0){
            for(int i=0;i<starting;i++){
                res2+=distance[i];
            }
        }
        return Math.min(res,res2);
    }
}
