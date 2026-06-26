public class RemoveElement {
    public static void main(String[] args) {

    }
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int n : nums){
            if(n!=val){
                nums[count]=n;
                count++;
            }
        }
        return count;
    }
}
