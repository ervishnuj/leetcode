public class CheckIfTwoStringArraysAreEquivalent {
 public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int len1=word1.length;
        int len2=word2.length;
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();

        int i=0;
        while(i<len1&&i<len2){
            sb1.append(word1[i]);
            sb2.append(word2[i]);
            i++;
        }
        while(i<len1){
            sb1.append(word1[i]);
            i++;
        }
        while(i<len2){
            sb2.append(word2[i]);
            i++;
        }
        System.out.println("sb1: "+sb1+" sb2: "+sb2);
        return sb1.toString().equals(sb2.toString());
    }
    
}