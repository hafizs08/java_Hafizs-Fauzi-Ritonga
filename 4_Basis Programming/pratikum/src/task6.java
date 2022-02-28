import java.util.Scanner;
public class task6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int one= 0, two=0;

        one=input.nextInt();
        two=input.nextInt();

        int answer = Pow(one, two);// Pow untuk menghitung dipangkatkan
        System.out.println(Pow(one, two));

    }

    public static int Pow(int one, int two){
        int result =1;
        for (int i = 0; i < two; i++) {
            result *= one;
        }
        return result;

    }
}
