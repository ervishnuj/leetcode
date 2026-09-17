public class CountElementsWithStrictlySmallerAndGreaterElements{
  public int CountElements(int[] nums) {
        
        int min=int.MaxValue;
        int max=int.MinValue;
        foreach(int i in nums){
            min=Math.Min(i,min);
            max=Math.Max(max,i);
        }
        int count=0;
        foreach(int i in nums){
            if(i<max&&i>min)count++;
        }
        return count;
    }
}
