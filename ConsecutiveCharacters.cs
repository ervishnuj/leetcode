public class ConsecutiveCharacters{
    public int MaxPower(string s) {
        int max=1;
        int intial=0;
        // HashSet<char> set = new HashSet<char>();
        // set.Add(s[0]);
        for(int i=1;i<s.Length;i++){
             if(s[i-1]==s[i]){
                if(max<i-intial+1)
                    max=i-intial+1;
                    // Console.WriteLine(set.Count+" If Block ");
                    Console.WriteLine(max+" If Block ");
                }
            else{
                if(max<i-intial)max=i-intial;
                // set.Clear();
                intial=i;
                // Console.WriteLine(set.Count+" Else Block ");
                // set.Add(s[i]);
                Console.WriteLine(max+" Else part ");
            }
            // set.Add(s[i]);

            // set.Add(s[i]);
            // if(s[i-1]!=s[i]&&!set.Contains(s[i])){
            //     if(max<set.Count+1)
            //         max=set.Count+1;
            //         Console.WriteLine(set.Count+" If Block ");
            //         Console.WriteLine(max+" If Block ");
            //     }
            // else{
            //     if(max<set.Count)max=set.Count;
            //     set.Clear();
            //     Console.WriteLine(set.Count+" Else Block ");
            //     // set.Add(s[i]);
            //     Console.WriteLine(max+" Else part ");
            // }
            // set.Add(s[i]);

        }
        if(max<s.Length-intial)max=s.Length-intial;
        return max;
    }

}
