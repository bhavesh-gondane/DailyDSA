public class LengthOfLastWord {
    public static void main(String[] args) {

    }
    public static int lengthOfLastWord(String s) {
        String str = s.trim();
        StringBuilder builder = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)==' '){
                break;
            } else {
                builder.append(str.charAt(i));
            }
        }
        return builder.length();
    }
}
