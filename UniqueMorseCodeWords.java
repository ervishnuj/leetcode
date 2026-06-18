class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        String[] s={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashMap<Character,String> map=new HashMap<>();
        for(int i=0;i<26;i++){
            map.put((char)('a'+i),s[i]);

            // System.out.println(((char)('a'+i))+" : "+s[i]);
        }
        Set<String> al= new HashSet<>();
        for(int i=0;i<words.length;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<words[i].length();j++){
                sb.append(map.get(words[i].charAt(j)));
            }
            al.add(sb.toString());
        }
        return al.size();
    }
} 
