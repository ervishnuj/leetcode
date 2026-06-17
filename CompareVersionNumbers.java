class CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        // version1=version1.replaceAll(".","");
        // version2=version2.replaceAll(".","");
        int n=version1.length();
        int m=version2.length();
        int i=0;
        int j=0;
        while(i<n||j<m){
            int fir=0;int sec=0;
            while(i<n&&version1.charAt(i)!='.'){
                fir=fir*10+version1.charAt(i)-'0';
                i++;
            }
            while(j<m&&version2.charAt(j)!='.'){
                sec=sec*10+version2.charAt(j)-'0';
                j++;
            }
            if(fir<sec)return -1;
            else if(fir>sec)return 1;
            i++;
            j++;
        }
        return 0;
    }
}
