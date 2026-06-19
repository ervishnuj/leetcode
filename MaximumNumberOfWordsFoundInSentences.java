public class MaximumNumberOfWordsFoundInSentences {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(String s:sentences){
            int count=s.trim().split("\\s+").length;
            if(max<count)max=count;
        }
        return max;
    }
}
