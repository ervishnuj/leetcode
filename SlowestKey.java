public class SlowestKey {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int index=0;
        int min=releaseTimes[0];
        int len=keysPressed.length();
        for(int i=1;i<len;i++){
            if(min<releaseTimes[i]-releaseTimes[i-1]||min==releaseTimes[i]-releaseTimes[i-1]&&keysPressed.charAt(i)>keysPressed.charAt(index)){
                min=releaseTimes[i]-releaseTimes[i-1];
                index=i;
            }
        }
        return keysPressed.charAt(index);
    }
}
