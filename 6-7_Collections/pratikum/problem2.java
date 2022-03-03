import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class problem2 {
    public static void main(String[] args) {
        System.out.println(angkaSekali("76523752"));
    }

    static List<Integer> angkaSekali(String angka) {
        HashMap<String, Integer> temp = new HashMap<>();
        List<Integer> angkaResult = new ArrayList<>();
        List<String> angkaList = new ArrayList<String>(Arrays.asList(angka.split("")));
        for (var v: angkaList) {
            temp.put(v, (temp.get(v) == null? 0:temp.get(v))  +1);
        }
        for (var v: temp.keySet()) {
            if (temp.get(v) == 1) {
                angkaResult.add(Integer.parseInt(v));
            }
        }
        return angkaResult;
    }

}
