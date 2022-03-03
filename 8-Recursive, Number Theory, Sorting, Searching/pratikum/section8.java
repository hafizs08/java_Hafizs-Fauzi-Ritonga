import java.util.Scanner;
public class section8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int isi=input.nextInt();
        long[] prima = new long[isi];
        prima[0] = 2;
        prima[1]=3;
        int hitung = 2;
        long angka = 5;
        luar:
        for (; hitung < prima.length; angka +=2){
            long limit = (long)Math.ceil(Math.sqrt((double) angka));
            for (int i = 1; i < hitung && prima[i] <=limit; i++)
                if (angka%prima[i] == 0)
                    continue luar;        
               prima[hitung++] = angka;
           
        }
            System.out.println(prima[hitung-1]);
    }
    
 }