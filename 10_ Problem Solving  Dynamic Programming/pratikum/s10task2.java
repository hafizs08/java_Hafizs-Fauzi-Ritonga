public class s10task2 {
    public static void main(String[] args){
        System.out.println(fibUp(5));
    } 
    public static int fibUp(int n){
        int[] fib = new int[n+1];
        fib[0] = 0;
        fib[1] = 1;
        for(int i=2; i<=n; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[n];
    }   
}
