import java.util.Scanner;
public class task8 {
    public static void main (String args[]){

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        for(int i=1; i<=x; i++){
            for(int j=1; j<=x; j++){
                System.out.print(i*j+"\t");
            }
            System.out.println();
        }
    }
}
