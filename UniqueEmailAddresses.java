import java.util.HashSet;

class UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set=new HashSet<>();
        // for(int i=0;i<emails.length;i++){
        for(String email:emails){
            int index=email.indexOf('@');
            String name=email.substring(0,index);
            String domain=email.substring(index);
            if(name.contains("+")){
                int plusIndex=name.indexOf('+');
                name=name.substring(0,plusIndex);
            }
            name=name.replace(".","");
            set.add(name+domain);
        }
        return set.size();
    }
}