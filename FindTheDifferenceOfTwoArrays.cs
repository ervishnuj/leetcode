using System.Collections.Generic;
public class FindTheDifferenceOfTwoArrays {
    public IList<IList<int>> FindDifference(int[] nums1, int[] nums2) {
    //     IList<IList<int>> res=new List<IList<int>>(); 
    //     HashSet<int> set1=new HashSet<int>();
    //     HashSet<int> set2=new HashSet<int>();
    //     foreach(int nums in nums1){
    //         set1.Add(nums);
    //     }
    //     foreach(int nums in nums2){
    //         set2.Add(nums);
    //     }
    //     IList<int> s1=new List<int>();
    //     IList<int> s2=new List<int>();
    //     foreach(int num in nums1){
    //         if(!set2.Contains(num)){
    //             if(s1.Contains(num))
    //             s1.Add(num);
    //             s1.Remove(num);
    //         }
    //     }
    //     foreach(int num in nums2){
    //         if(!set1.Contains(num)){
    //             if(s2.Contains(num))
    //             s2.Add(num);
    //             s2.Remove(num);
    //         }
    //     }
    //     res.Add(s1);
    //     res.Add(s2);

    //     return res;
    // }
         // 1. Initialize outer list cleanly
        IList<IList<int>> res = new List<IList<int>>(); 
        
        // 2. Use HashSets to track unique values
        HashSet<int> set1 = new HashSet<int>(nums1);
        HashSet<int> set2 = new HashSet<int>(nums2);
        
        // 3. Use HashSets for rows to easily prevent duplicates
        HashSet<int> distinct1 = new HashSet<int>();
        HashSet<int> distinct2 = new HashSet<int>();
        
        // Find elements in nums1 that are not in nums2
        foreach(int num in nums1){
            if(!set2.Contains(num)){
                distinct1.Add(num);
            }
        }
        
        // Find elements in nums2 that are not in nums1
        foreach(int num in nums2){
            if(!set1.Contains(num)){
                distinct2.Add(num);
            }
        }
        
        // 4. Convert concrete Lists to match the IList interface constraints
        res.Add(new List<int>(distinct1));
        res.Add(new List<int>(distinct2));

        return res;
    }
}
