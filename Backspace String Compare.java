class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> sts=new Stack<>();
        Stack<Character> stt=new Stack<>();
        int n=s.length();
        int i=0;
        int m=t.length();
        while(i<n||i<m){
            if(i<n){
            char ch=s.charAt(i);
            if(ch=='#'&&!sts.isEmpty()){
                sts.pop();
            }else if(ch!='#'){
                sts.push(ch);
            }
            }
            if(i<m){
                 char ch=t.charAt(i);
            if(ch=='#'&&!stt.isEmpty()){
                stt.pop();
            }else if(ch!='#'){
                stt.push(ch);
            }
            }
            i++;

        }
        while(!sts.isEmpty()&&!stt.isEmpty()){
            if(sts.pop()!=stt.pop())return false;
        }
        return sts.isEmpty()&&stt.isEmpty();

    }
}
