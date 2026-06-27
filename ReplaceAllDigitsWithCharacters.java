public class ReplaceAllDigitsWithCharacters {
    public String replaceDigits(String s) {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        int len=n%2==0?n:n-1;
        for(int i=1;i<len;i+=2){
            sb.append(s.charAt(i-1));
            char ch=(char)((int)(s.charAt(i-1))+(s.charAt(i)-'0'));
            sb.append(ch);
        }
        if(n%2==1){
            sb.append(s.charAt(n-1));
        }
        return sb.toString();
    }
}
