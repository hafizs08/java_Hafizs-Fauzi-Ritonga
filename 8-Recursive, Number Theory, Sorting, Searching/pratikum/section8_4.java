import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class section8_4 {
    
    public static void main( String[] args){
        int temp = 0, total = 0, uang = 30000, jumlahUang = 0;
        ArrayList<Integer> list = new ArrayList<>(List.of(15000, 10000, 12000, 5000, 3000));
        Collections.sort(list);

        while(uang > 0 && temp < list.toArray().length){
            if(jumlahUang == 0){
                jumlahUang = list.get(temp); 
                //System.out.println(jumlahUang);  
            }if(jumlahUang !=  list.get(temp)){
                jumlahUang = uang- list.get(temp);
                //System.out.println(jumlahUang);
                total++;     
            }
            temp++;   
        }
         System.out.println(total);
    }
}