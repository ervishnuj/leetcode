class ReformatTheString{
  public String reformat(String s) {
        int letterCount = 0;
        int digitCount = 0;

        // Step 1: Count letters and digits
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            } else {
                letterCount++;
            }
        }

        // Impossible if count difference is greater than 1
        if (Math.abs(letterCount - digitCount) > 1) {
            return "";
        }

        char[] result = new char[s.length()];
        
        // Larger group takes even indices (0, 2, 4...), smaller group takes odd (1, 3, 5...)
        boolean letterIsEven = letterCount >= digitCount;
        int evenIdx = 0;
        int oddIdx = 1;

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                if (letterIsEven) {
                    result[evenIdx] = c;
                    evenIdx += 2;
                } else {
                    result[oddIdx] = c;
                    oddIdx += 2;
                }
            } else { // It's a digit
                if (!letterIsEven) {
                    result[evenIdx] = c;
                    evenIdx += 2;
                } else {
                    result[oddIdx] = c;
                    oddIdx += 2;
                }
            }
        }

        return new String(result);
        // ArrayList<Character> ch=new ArrayList<>();
        // ArrayList<Character> num=new ArrayList<>();
        // for(Character c: s.toCharArray()){
        //     if(c>='0'&&c<='9'){
        //         num.add(c);
        //     }else{
        //         ch.add(c);
        //     }
        // }
        // if(num.size()!=ch.size())return "";
        // StringBuilder sb=new StringBuilder();
        // int len=num.size();
        // for(int i=0;i<len;i++){
        //     sb.append(num.get(i)+""+ch.get(i));
        // }
        // return sb.toString();
    }
}
