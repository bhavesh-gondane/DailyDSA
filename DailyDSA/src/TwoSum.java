import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(TwoSum.twoSum(new int[]{3,2,3},6)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] resArr = new int[2];
        int left=0,right=left+1;
        while (left<=nums.length-2&&right<=nums.length-1){
            int sum = nums[left]+nums[right];
            if(sum==target){
                resArr[0]=left;
                resArr[1]=right;
                break;
            }
            if(right==nums.length-1){
                left++;
                right=left+1;
                continue;
            }
            right++;
        }
        return resArr;
    }
}
