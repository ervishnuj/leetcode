public class DivideArrayIntoEqualPairs {
    public bool DivideArray(int[] nums) {
        // Dictionary < int, int > map = new Dictionary <int,int> ();
        Hashtable map = new Hashtable ();

        foreach(int i in nums){
            if(map.ContainsKey(i)){
                int res=(int)map[i];
                // Console.WriteLine(res);
                // map.Add(i,res+1);
                map[i] = res + 1; 
            }else{
                map[i]=1;
            }
        }
        foreach(int i in nums){
            if(((int)map[i])%2!=0){
                return false; 
            }
        }
        // Console.WriteLine(map);
        return true;
        // foreach()
    }
}
