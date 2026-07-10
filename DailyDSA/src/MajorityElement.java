import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {

    }
    public static int majorityElement(int[] nums) {
        int n = nums.length/2;
        Map<Integer,Integer> map = new HashMap<>();
        for(int n1 : nums){
            map.put(n1,map.getOrDefault(n1,0)+1);
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue()>n){
                return entry.getKey();
            }
        }
        return -1;
    }
}