import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class coba {
    public static void main(String[] args) {
    System.out.println(factorial(5));
    }
    
    public static int factorial(int n) {
        if (n == 1) {
            System.out.println(n+" ini nilai n");
         
            return 1;
        }
        int result = n * factorial(n-1);
        System.out.println(result+" ini result");
        return result;
        
    }
   


}

