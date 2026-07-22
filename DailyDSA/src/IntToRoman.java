import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class IntToRoman {
    public static void main(String[] args) {
        System.out.println(IntToRoman.intToRoman(3749));
    }
    public static String intToRoman(int num) {
        Map<String,Integer> map = new LinkedHashMap<>();
        map.put("M",1000);
        map.put("D",500);
        map.put("C",100);
        map.put("L",50);
        map.put("X",10);
        map.put("V",5);
        map.put("I",1);
        StringBuilder builder = new StringBuilder();
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            while (num>=entry.getValue()){
                builder.append(entry.getKey());
                num=num-entry.getValue();
            }
        }
        return builder.toString();
    }
}
