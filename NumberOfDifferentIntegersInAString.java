import java.util.HashSet;

public class NumberOfDifferentIntegersInAString {
    
    public int numDifferentIntegers(String word) {
                HashSet<String> set = new HashSet<>();

        int i = 0;

        while (i < word.length()) {

            // Skip letters
            while (i < word.length() && !Character.isDigit(word.charAt(i))) {
                i++;
            }

            if (i == word.length()) break;

            // Remove leading zeros
            while (i < word.length() &&
                   word.charAt(i) == '0') {
                i++;
            }

            StringBuilder sb = new StringBuilder();

            while (i < word.length() &&
                   Character.isDigit(word.charAt(i))) {
                sb.append(word.charAt(i));
                i++;
            }

            if (sb.length() == 0)
                set.add("0");
            else
                set.add(sb.toString());
        }

        return set.size();
        // HashSet<String> hs=new HashSet<>();
        // int i=0;
        // int len=word.length();
        // while(i<len){
        //     int ch=word.charAt(i)-'0';
        //     while(i<len&&(ch<0||ch>9)){
                
        //         i++;
        //         if(i<len)
        //         ch=word.charAt(i)-'0';
        //     }
        //     if(i==len)break;
        //     // remove intial zetos
        //     while(i<len&&ch==0){
        //         i++;
        //         if(i<len)
        //         ch=word.charAt(i)-'0';
        //     }

        //     if(i==len)break;
        //     // if(i<len)
        //         ch=word.charAt(i)-'0';
        //     StringBuilder sb=new StringBuilder();
        //     while(i<len&&ch>=0&&ch<=9){
        //         sb.append(word.charAt(i));
        //         i++;
        //         if(i<len)
        //         ch=word.charAt(i)-'0';
        //     }
        //     if (sb.length() == 0)
        //         hs.add("0");
        //     else
        //         hs.add(sb.toString());
        //     if(i==len)break;
        // }
        // return hs.size();
        // int res=-1;
        // HashSet<Integer> hs=new HashSet<>();
        // boolean b=true;
        // int n=word.length();
        // for(int i=0;i<n;i++){
        //     int ch=word.charAt(i)-'0';
        //     if(ch>=0&&ch<=9){
        //         if(b){
        //             b=false;
        //             res=0;
        //         }
        //         res*=10;
        //         res+=ch;
        //     }else if(res>-1){
        //         hs.add(res);
        //         res=0;
        //     }
        // }

        // if(res>-1){
        //     hs.add(res);
        // }

        // return hs.size();
    }
}
