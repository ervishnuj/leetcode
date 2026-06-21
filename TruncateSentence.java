public class TruncateSentence {
    public String truncateSentence(String s, int k) {
        int space=0;
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch==' ')space++;
            if(space==k)return sb.toString();
            sb.append(ch);
        }
        return sb.toString();
    }
}
