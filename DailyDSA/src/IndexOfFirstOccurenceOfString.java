public class IndexOfFirstOccurenceOfString {
    public static void main(String[] args) {

    }
    public static int strStr(String haystack, String needle) {
//        boolean contains = haystack.contains(needle);
//        if (contains){
//            for (int i=0;i<haystack.length();i++){
//                if(haystack.charAt(i)==needle.charAt(i)){
//                    int j=i+1;
//                    while (j<needle.length()){
//                        if(haystack.charAt(j)!=needle.charAt(j)){
//                            break;
//                        }
//                        j++;
//                    }
//                    if(j==needle.length()){
//                        return i;
//                    }
//                }
//            }
//        }
//        return -1;

        if(needle.length()>haystack.length()){
            return -1;
        }
        if(!haystack.contains(needle)){
            return -1;
        }
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                String str = haystack.substring(i,i+needle.length());
                if(str.equals(needle)){
                    return i;
                }
            }
        }
        return -1;

        //another solution
//        return haystack.indexOf(needle);
    }
}
