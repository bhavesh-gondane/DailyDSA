import java.util.HashMap;
import java.util.Map;

public class SearchInsertPosition {
    public static void main(String[] args) {
        System.out.println(SearchInsertPosition.searchInsert(new int[]{1,3,5},4));

    }
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left<=right) {
//            int mid = left+(nums.length-1)/2;
            int mid = left+ (right-left)/2;
            if (nums[mid]==target)
                return mid;
            if (nums[mid]<target)
                left = mid+1;
            else
                right =mid-1;
        }
        return left;
//        if(nums.length==1){
//            if(nums[0]>=target){
//                return 0;
//            }else {
//                return 1;
//            }
//        }
//        int left=0,right=nums.length-1;
//        while (left<=right){
//            int temp1 = nums[left];
//            int temp2 = nums[right];
//            if(temp1==target){
//                return left;
//            }
//            if (temp2==target){
//                return right;
//            }
//            left++;
//            right--;
//            if(nums[left]>target&&temp1<target){
//                return left;
//            }
//            if(temp2>target&&nums[right]<target){
//                return right;
//            }
//        }
//        if(target<nums[0]){
//            return 0;
//        }else
//            return nums.length;
    }
}
