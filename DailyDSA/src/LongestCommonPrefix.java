public class LongestCommonPrefix {
    public static void main(String[] args) {

    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        String str = strs[0];
        for(int i=0;i<str.length();i++){
            for (int j=1;j<strs.length;j++){
                if(i>=strs[j].length()||str.charAt(i)!=strs[j].charAt(i)){
                    return str.substring(0,i);
                }
            }
        }
        return str;
    }
}
