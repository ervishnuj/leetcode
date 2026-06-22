public class RearrangeSpacesBetweenWords {
    public String reorderSpaces(String text) {
        int space=0;
        int count=1;
        if(text.charAt(0)==' '){
            space=1;
            count=0;
        }
        int n=text.length();
        for(int i=1;i<n;i++){
            char ch=text.charAt(i);
            if(ch==' ')space++;
            else if(ch!=' '&&text.charAt(i-1)==' ')count++;
        }
        text= text.trim();
        n=text.length();
        StringBuilder sb=new StringBuilder();
        if(count<2){
            sb.append(text);
            while(space-->0){
                sb.append(' ');
            }
            return sb.toString();
        }
        int bal=space%(count-1);
        space=space/(count-1);

        for(int i=0;i<n;i++){
            char ch=text.charAt(i);
            if(ch!=' '){
                sb.append(ch);
            }else{
                int j=0;
                while(j<space){
                    sb.append(' ');
                    j++;
                }
                while(i<n&&text.charAt(i)==' '){
                    i++;
                }
                i--;
            }
        }
        while(bal-->0)sb.append(' ');
        return sb.toString();
    }
}
