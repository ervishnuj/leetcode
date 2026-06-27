public class StoneRemovalGame {
    public boolean canAliceWin(int n) {
        boolean al=false;
        if(n<10)return al;
        int remove=10;
        al=true;
        while(remove>0){
            if(n<remove){
                return !al;
           }
            n-=remove;
            remove--;
            al=!al;
        }
        return al;
    }
}
