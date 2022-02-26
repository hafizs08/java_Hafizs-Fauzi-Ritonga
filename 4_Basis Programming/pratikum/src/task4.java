import java.util.Scanner;
public class task4 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int isi=0;
        int angka=input.nextInt();

        for (int i=2; i<=angka; i++){//8
            if (angka%i==0){  //Jika mod = 0 isi tambah
                isi++;
            }
        }

        if (isi==1){
            System.out.println("bilangan prima");
        }else {
            System.out.println("bukan bilangan prima");
        }
    }
}
