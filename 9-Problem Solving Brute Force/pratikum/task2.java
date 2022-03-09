import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class task2 {
    public static void main (String [] args){
        System.out.println(task2(123));
    }
    static List<Integer> task2(int M){
        List<Integer> mc = Arrays.asList(1,10,20,50,100,200,500,1000,2000,5000);
        Collections.sort(mc, Collections.reverseOrder());

        List<Integer> hsl = new ArrayList<>();
        while(M>0){
            for(int i=0;i<mc.size();i++){
                if(M>=mc.get(i)){
                    hsl.add(mc.get(i));
                    M-=mc.get(i);
                    break;
                }
            }
        }
        return hsl;
    }
    
}
