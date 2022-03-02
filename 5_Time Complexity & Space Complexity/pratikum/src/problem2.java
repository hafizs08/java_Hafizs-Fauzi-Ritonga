

public class problem2 {
    public static void main(String[] args) {
        // Pow untuk menghitung dipangkatkan
        System.out.println(Pow(2, 3));  // 8
        System.out.println(Pow(5, 3));  // 125
        System.out.println(Pow(10, 2)); // 100
        System.out.println(Pow(2, 5)); // 32
        System.out.println(Pow(7, 3));
    }

    public static int Pow(Integer one, Integer two){
        int result =1;
        for (int i = 0; i < two; i++) {//
            result *= one;
        }
        return result;

    }
}
