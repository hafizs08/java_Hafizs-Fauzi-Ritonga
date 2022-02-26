import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int o= 0, x=0;

        String isi = input.nextLine();

        isi = isi.toLowerCase();

        for(int i=0; i<isi.length();i++){
            char index = isi.charAt(i);
            if(index=='x'){
                x++;
            }
            else if (index=='o'){
                o++;
            }
        }

        if (x == o) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
