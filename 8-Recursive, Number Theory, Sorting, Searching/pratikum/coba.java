import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class coba{
    
    public static int problem3(int[] batu) { 
 
        PriorityQueue<Integer> temp = new PriorityQueue<>(Collections.reverseOrder());
        for (Integer weight : batu) {
             temp.add(weight);
        }
        while (temp.size() > 1) {
           temp.add(temp.poll() - temp.poll());
        }
        return temp.peek();
      }
  
      public static void main(String[] args) {
        int[] arr = {2,4,5};
        System.out.println(problem3(arr));
    
     }
}
   
