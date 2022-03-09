import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class task3 {
    public static void main(String[] args) {
        System.out.println(dragonWater(new Integer[] { 5, 4 }, new Integer[] { 7, 8, 4 }));
        System.out.println(dragonWater(new Integer[] { 5, 10 }, new Integer[] { 5 }));

    }

    static String dragonWater(Integer[] dragon, Integer[] knight) {
        List<Integer> d = new ArrayList<>(Arrays.asList(dragon));
        List<Integer> k = new ArrayList<>(Arrays.asList(knight));

        int result = 0;
        if (d.size() > k.size()) {
            return "knight fall";
        }else if(Collections.max(d) > Collections.max(k)){
            return "knight fall";
        }else{
            Collections.sort(d);
            Collections.sort(k);
            for (int i = 0; i < d.size(); i++) {
                if (d.get(i) > k.get(i)) {
                    result += d.get(i);
                } else {
                    result += k.get(i);
                }
            }  
        }
        return "Hasil minimum " + result;
    }
}