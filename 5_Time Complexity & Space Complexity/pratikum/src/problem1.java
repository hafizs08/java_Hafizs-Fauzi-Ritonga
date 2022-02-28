public class problem1 {
   static int primeNumber(Integer angka) {
        int isi = 0;
        for (int i = 2; i <= angka; i++) {//8
            if (angka % i == 0) {  //Jika mod = 0 isi tambah
                isi++;
            }
        }
        if (isi == 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        return angka;
    }
    public static void main(String[] args) {
        System.out.println(primeNumber(1000000007));
        System.out.println(primeNumber(13));
        System.out.println(primeNumber(17));
        System.out.println(primeNumber(20));
        System.out.println(primeNumber(35));
    }

}