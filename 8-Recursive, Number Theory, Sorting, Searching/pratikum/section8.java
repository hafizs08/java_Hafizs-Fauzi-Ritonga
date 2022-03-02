public class section8 {
     public static void main(String[] args) {
        int  n=20;
        System.out.println("All Prime Numbers Between 1 to "+n);
        boolean isPrime;
        
        for (int i = 2; i <= n; i++) {
            isPrime = true;
            for (int j = 2; j <=Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.print(i + " ");
                
        }
     }
 
 }