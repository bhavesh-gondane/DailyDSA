import java.util.Arrays;

public class ZeroEndOfArray {
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,2,0,4,3,2,0,1,0};
        int j=0;
        for(int x : arr){
            if(x!=0){
                arr[j]=x;
                j++;
            }
        }
        while (j<arr.length){
            arr[j]=0;
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
