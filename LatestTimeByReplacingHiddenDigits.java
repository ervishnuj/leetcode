public class LatestTimeByReplacingHiddenDigits {
    public String maximumTime(String time) {
       StringBuilder s = new StringBuilder(time);
        if(s.charAt(0) == '?' && s.charAt(1) == '?') s.replace(0,2,"23");
        else{
            if(s.charAt(0) == '?'){
                if(s.charAt(1)>'3') s.setCharAt(0,'1');
                else s.setCharAt(0,'2');
            }
            if(s.charAt(1) == '?'){
                if(s.charAt(0) == '2') s.setCharAt(1,'3');
                else s.setCharAt(1,'9');
            }
        }
        if(s.charAt(3) == '?') s.setCharAt(3,'5');
        if(s.charAt(4) == '?') s.setCharAt(4,'9');
        return s.toString();

        // without string method;
        // char[] ch=time.toCharArray();
        // int fir=0;
        // if(ch[0]=='?'){
        //     if(ch[1]=='?'){
        //         fir=23;
        //     }else{
        //         if(ch[1]<'4'){
        //             fir=20+(ch[1]-'0');
        //         }else{
        //             fir=10+(ch[1]-'0');
        //         }
        //     }
            
        // }else if(ch[1]=='?'){
        //     if(ch[0]=='2'){
        //         fir=((ch[0]-'0')*10)+3;
        //     }else{
        //         fir=((ch[0]-'0')*10)+9;
        //     }
        // }else{
        //     fir=((ch[0]-'0')*10)+((ch[1]-'0'));
        // }
        // int sec=0;
        // if(ch[3]=='?'){
        //     if(ch[4]=='?'){
        //         sec=59;
        //     }else{
        //         sec=50+(ch[4]-'0');
        //     }
        // }else if(ch[4]=='?'){
            
        //     sec=((ch[3]-'0')*10)+9;
        // }else{
        //     sec=((ch[3]-'0')*10)+((ch[4]-'0'));
        // }
        // return (fir>9?fir:("0"+fir))+":"+((sec>9)?sec:("0"+sec));
    }
}
