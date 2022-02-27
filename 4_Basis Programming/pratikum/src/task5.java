import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String isi = input.nextLine();
        String  balik = "";

        int panjang = isi.length();

        for (int i = (panjang - 1); i >=0; --i) {
            balik = balik + isi.charAt(i);
        }

        if (isi.toLowerCase().equals(balik.toLowerCase())) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Bukan Palindrome");
        }
    }
}
