class WeightedWordMapping {
    public String mapWordWeights(String[] words, int[] weights) {
        String res=new String();
        char[] ch={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for(int i=0;i<words.length;i++){
            int temp=0;
            int j=0;
            while(j<words[i].length()){
                temp+=weights[words[i].charAt(j++)-'a'];
            }
            temp%=26;
            // char ch='z'-temp;
            res+=ch[26-temp-1];
        }
        return res;
    }
}
