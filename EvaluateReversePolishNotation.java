import java.util.Stack;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> num=new Stack<>();
        Stack<Character> ch=new Stack<>();
        int len=tokens.length;
        for(int i=0;i<len;i++){
            if(tokens[i].equals("*")||tokens[i].equals("/")||tokens[i].equals("+")||tokens[i].equals("-")){
                ch.push(tokens[i].charAt(0));
            }else{
                int val=pushValue(tokens[i]);
                System.out.println(tokens[i]+" : ");
                System.out.println(val);
                num.push(val);
            }
            if(!ch.isEmpty()){
                char c=ch.pop();
                if(c=='+'){
                    int f=0;int s=0;
                    if(!num.isEmpty()){
                        f=num.pop();
                    }
                    if(!num.isEmpty()){    
                       s=num.pop();
                    }
                    System.out.println("+: f: "+f+" s: "+s);
                    num.push(f+s);
                }else if(c=='-'){
                      int f=0;int s=0;
                    if(!num.isEmpty()){
                       f=num.pop();
                    }
                    if(!num.isEmpty()){    
                       s=num.pop();
                    }
                    System.out.println("-: f: "+f+" s: "+s);
                    num.push(s-f);
                }else if(c=='*'){
                      int f=0;int s=0;
                    if(!num.isEmpty()){
                       f=num.pop();
                    }
                    if(!num.isEmpty()){    
                       s=num.pop();
                    }
                    System.out.println("*: f: "+f+" s: "+s);
                    num.push(f*s);
                }else if(c=='/'){
                      int f=0;int s=0;
                    if(!num.isEmpty()){
                       f=num.pop();
                    }
                    if(!num.isEmpty()){    
                       s=num.pop();
                    }
                    System.out.println("/: f: "+f+" s: "+s);
                    num.push(s/f);
                }
            }
        }
        return num.pop();
    }
    public int pushValue(String num){
        int neg=1;
        int index=0;
        if(num.charAt(0)=='+'||num.charAt(0)=='-'){
            index++;
            if(num.charAt(0)=='-')neg*=-1;
        }
        int res=0;
        while(index<num.length()){
            res*=10;
            res+=num.charAt(index++)-'0';
        }
        return res*neg;
    }
}
