import java.util.ArrayList;

public class OccurrencesAfterBigram {
    public String[] findOcurrences(String text, String first, String second) {
        ArrayList<String> al=new ArrayList<>();
        String[] st=text.split(" ");
        int n=st.length;
        for(int i=0;i<n-2;i++){
            if(st[i].equals(first)&&st[i+1].equals(second))al.add(st[i+2]);
        }
        String[] s=new String[al.size()];
        int i=0;
        for(String ss:al){
            s[i++]=ss;
        }
        return s;
        // return new String[]{first,second};
    }
}
