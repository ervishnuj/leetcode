public class PercentageOfLetterInString {
    public int percentageLetter(String s, char letter) {
        String lett=s.replaceAll(letter+"","");
        int len=s.length();
        int llen=len-lett.length();
        return (llen*100/len);
    }
}
