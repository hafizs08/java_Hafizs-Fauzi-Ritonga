public class section8_2 {
 
    static int n1 = 0, n2 = 1, n3 = 0;

    static void printFibonacci(int n) {
        if (n > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            printFibonacci(n - 1);
        }
    }

    public static void main(String args[]) {
        int n = 11;
        System.out.print(n1 + " " + n2);// mencetak 0 dan 1
        printFibonacci(n - 2);// n-2 karena 2 angka sudah tercetak
    }

}