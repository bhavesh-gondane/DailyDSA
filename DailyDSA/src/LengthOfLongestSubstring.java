import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        System.out.println(LengthOfLongestSubstring.lengthOfLongestSubstring("pwwkew"));
    }
    public static int lengthOfLongestSubstring(String s) {
//        int res = 0;
//        StringBuilder str = new StringBuilder();
//        for(int i = 0;i<s.length()-1;i++){
//            char ch = s.charAt(i);
//            if(str.toString().contains(Character.toString(ch))){
//                res=Math.max(res,str.length());
//                str.setLength(0);
//                i--;
//                continue;
//            }
//            str.append(ch);
//            if(i++==s.length()-1){
//                char c = s.charAt(i++);
//                str.append(c);
//                return str.length();
//            }
//        }
//        return res;
//        Set<Character> set = new HashSet<>();
//        int left = 0;
//        int max = 0;
//        for(int i = 0; i < s.length(); i++) {
//            while(set.contains(s.charAt(i))) {
//                set.remove(s.charAt(left));
//                left++;
//            }
//            set.add(s.charAt(i));
//            max = Math.max(max, i - left + 1);
//        }
//        return max;


        int left=0,right=0;
        int[] arr = new int[256];
        int maxLength = 0;
        while(right<s.length()){
            char c = s.charAt(right);
            int cAscii = c;
            arr[cAscii] = arr[cAscii]+1;
            while (arr[cAscii]>1){
                char ch = s.charAt(left);
                int chAscii = ch;
                arr[chAscii]=arr[chAscii]-1;
                left++;
            }
            int currLength = right-left+1;
            maxLength=Math.max(currLength,maxLength);
            right++;
        }
        return maxLength;
    }
}
