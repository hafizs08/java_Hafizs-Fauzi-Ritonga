import java.util.Scanner;

public class kandang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //calculator c = new calculator();

        //c.panggil();
        System.out.println("1: Open Calculator");
        System.out.println("99: Exit");
        System.out.print("masukan pilahan anda : ");
        int pil = input.nextInt();

        if (pil == 1) {
            System.out.println("masukan jumlah kandang : ");
            int kandang = input.nextInt();
            for( int i= 0; i<=kandang;  i++){
                System.out.println("|||");
                System.out.println("|"+i+"|");
                System.out.println("|||");
            }
        }

        // class calculator extends data {
        //     private String title = " ";

        //     public String panggil() {
        //         System.out.println("+++++++++++++++++++++calcutor+++++++++++++++++++++++");
        //         return title;
        //     }
        // }
    }
}
