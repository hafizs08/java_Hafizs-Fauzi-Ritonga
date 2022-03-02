import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class problem1 {
    public static void main(String[] args) {
        System.out.println(gabung(
                List.of("lee", "jin"),
                List.of("panda", "kazuya")));
    }

    static List<String> gabung(List<String> arrayA, List<String> arrayB) {

        HashSet<String> tambah = new HashSet<>();

        for (var tempatA : arrayA) {
            tambah.add(tempatA);
        }

        for (var tempatB : arrayB) {
            tambah.add(tempatB);
        }

        List<String> result = new ArrayList<>(tambah);
        return result;
    }

}
