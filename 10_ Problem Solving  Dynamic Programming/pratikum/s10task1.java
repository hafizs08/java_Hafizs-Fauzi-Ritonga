public class s10task1 {
    public static void main(String[] args){
        System.out.println(fibDown(10));
    } 
    public static int fibDown(int n){
        if(n<=1){
            return n;
        }
        return fibDown(n-1) + fibDown(n-2);
        
    }
    
}
