public class Maximum69Number {
    public int maximum69Number (int num) {
        int res=0;
        String st=num+"";
        boolean b=false;        
        for(int i=0;i<st.length();i++){
            res*=10;
            if(!b&&st.charAt(i)-'0'<9){
                res+=9;
                b=true;
            }else{
                res+=st.charAt(i)-'0';
            }
        }
        return res;
    }
}
