class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=candies[0];
        for(Integer i: candies){
            if(max<i)max=i;
        }
        List<Boolean> result=new ArrayList<>();
        for(Integer i:candies){
            if(i==max || (i+extraCandies)>=max)result.add(true);
            else result.add(false);
        }
        return result;
    }
}
