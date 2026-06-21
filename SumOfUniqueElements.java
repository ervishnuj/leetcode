public class SumOfUniqueElements {
     public int sumOfUnique(int[] nums) {
        int res=0;
        int[] r=new int[101];
        for(int i:nums)r[i]++;
        for(int i=0;i<101;i++)if(r[i]==1)res+=i;
        return res;
    }
}
