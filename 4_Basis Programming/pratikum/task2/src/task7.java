import java.util.Scanner;
public class task7 {
    public static void main(String args[])
    {
        int i, j, x = 0;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        for (i=0; i<x; i++)
        {
            for (j=x-i; j>1; j--)
            {
                System.out.print(" ");
            }
            for (j=0; j<=i; j++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
