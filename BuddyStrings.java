class Solution {
    public boolean buddyStrings(String s, String goal) {
        int slen=s.length();
        int glen=goal.length(); 
        if(glen!=slen)return false;
        int count=0;
        if(s.equals(goal)){
            char[] freq=new char[26];
            for(Character ch:s.toCharArray()){
                freq[ch-'a']++;
                if(freq[ch-'a']>=2)return true;
            }
            return false;
        }
        int first=-1,second=-1;
        for(int i=0;i<slen;i++){
            if(s.charAt(i)!=goal.charAt(i)){
                count++;
                // if(ch!='0'&&goal.charAt(i)==ch)b=true;
                // ch=s.charAt(i);
                if(first==-1)first=i;
                else if(second==-1)second=i;
                else return false;
            }
        }   
        return second!=-1&&count==2&&s.charAt(first)==goal.charAt(second)&&s.charAt(second)==goal.charAt(first);
    }
}
