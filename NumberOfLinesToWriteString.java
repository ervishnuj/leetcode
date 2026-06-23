public class NumberOfLinesToWriteString {
    public int[] numberOfLines(int[] widths, String s) {
        int sum=0;
        int[] arr=new int[2];
        arr[0]=0;
        arr[1]=0;
        for(int i=0;i<s.length();i++){
            int ch=s.charAt(i)-'a';
            sum+=widths[ch];
            if(sum==100){
                arr[0]++;
                arr[1]=sum;
                sum=0;
            }else if(sum>100){
                arr[0]++;
                arr[1]=sum-widths[ch];
                sum=widths[ch];
            }else if(i==s.length()-1){
                arr[0]++;
                arr[1]=sum;

            }
        }

        if(arr[1]>sum&&sum!=0){
            arr[0]++;
            arr[1]=sum;                
        }
        return arr;
    }
}
