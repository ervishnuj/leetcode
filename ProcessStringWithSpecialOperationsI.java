class ProcessStringWithSpecialOperationsI {
    public String processStr(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
                st.push(s.charAt(i));
            }else if(!st.isEmpty()&&s.charAt(i)=='#'){
                StringBuilder sb = new StringBuilder();
                while (!st.isEmpty()) {
                    sb.append(st.pop());
                }
                
                sb.reverse(); 
                
                String original = sb.toString();
                sb.append(original); 
                
                for (int j = 0; j < sb.length(); j++) {
                    st.push(sb.charAt(j));
                }
                
            }else if(!st.isEmpty()&&s.charAt(i)=='*'){
                st.pop();
            }else if(!st.isEmpty()&&s.charAt(i)=='%'){
                String ss=new String();
                while(!st.isEmpty()){
                    ss+=st.pop();
                }
                for(Character str:ss.toCharArray()){
                    st.push(str);
                }
            }
        }
        StringBuilder ss=new StringBuilder();
        while(!st.isEmpty()){
            ss.append(st.pop());
        }
        return ss.reverse().toString();
    }
}
