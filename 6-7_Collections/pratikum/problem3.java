import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class problem3 {
    public static void main(String[] args) {
        System.out.println(task3(List.of(1, 2, 3, 4, 6), 6));
        System.out.println(task3(List.of(2, 5, 9, 11), 11));
    }

    static List<Integer> task3(List<Integer> array , Integer target){
        List<Integer> temp = new ArrayList<>();
        Map<Integer, Integer> tempat = new HashMap<>();

        for (int i = 0; i < array.toArray().length; i++) {
            int isi = target - array.get(i);

            
            if (tempat.get(isi) != null) {
                temp.add(tempat.get(isi));
                temp.add(i);
                break;
            }
            
            tempat.put(array.get(i), i);
        }

        return temp;
    }

}
