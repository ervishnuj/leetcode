class MaximumEnemyFortsThatCanBeCaptured {
public int captureForts(int[] forts) {
        int maxCaptured = 0;
        int n = forts.length;
       for (int i = 0; i < n; i++) {
            if (forts[i] == 1) {
                // Check right direction
                int j = i + 1;
                int count = 0;
                while (j < n && forts[j] == 0) {
                    count++;
                    j++;
                }
                if (j < n && forts[j] == -1) {
                    maxCaptured = Math.max(maxCaptured, count);
                }
                
                // Check left direction
                j = i - 1;
                count = 0;
                while (j >= 0 && forts[j] == 0) {
                    count++;
                    j--;
                }
                if (j >= 0 && forts[j] == -1) {
                    maxCaptured = Math.max(maxCaptured, count);
                }
            }
        }
        
        return maxCaptured;
        // int res=0;
        // for(int i=0;i<n;i++){
        //     if(forts[i]==0)res--;
        //     else if(forts[i]==1)res++;
        // }
        // return Math.abs(res);
    }
}
