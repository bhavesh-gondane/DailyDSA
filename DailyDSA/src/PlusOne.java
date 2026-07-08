import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PlusOne {
    public static void main(String[] args) {

    }
    public static int[] plusOne(int[] digits) {
//        List<Integer> list = new ArrayList<>();
//        StringBuilder builder = new StringBuilder();
//        for (int n : digits){
//            builder.append(n);
//        }
//        BigInteger i = new BigInteger(builder.toString());
//        BigInteger add = i.add(BigInteger.ONE);
//        String s = String.valueOf(add);
//        for (char c : s.toCharArray()){
//            list.add(Integer.parseInt(String.valueOf(c)));
//        }
//        int[] resArr = new int[list.size()];
//        int j=0;
//        for (int n : list){
//            resArr[j]=n;
//            j++;
//        }
//        return resArr;

        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] resArr = new int[digits.length+1];
        resArr[0]=1;
        return resArr;
    }
}

