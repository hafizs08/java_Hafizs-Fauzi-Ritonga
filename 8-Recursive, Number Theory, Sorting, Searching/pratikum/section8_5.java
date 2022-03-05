import java.util.HashMap;
import java.util.Map;

public class section8_5 {
    public static void main(String[]args){
        String [] temp = { "js", "js", "golang", "ruby", "ruby", "js", "js"};
        
        Map <String, Integer> map = new HashMap<>();
        for (String v : temp ){
            map.put(v, map.get(v) != null ? map.get(v) + 1 : 1);
        }
        for (String key : map.keySet()){
            System.out.print(key + " -> " + map.get(key) + " ");
        }
    }
}
