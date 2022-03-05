import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class section8_1 {
    public static int prime(int search) { 
        List<Integer> array = new ArrayList<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29)); 
        return array.get(search - 1); 
    } 
    public static void main(String[] args) { 
        System.out.println(prime(7)); 
    } 
}
