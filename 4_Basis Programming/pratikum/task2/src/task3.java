import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        for(int i=1;i<=x;i++)
        {
            if(x%i == 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}
