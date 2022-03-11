public class task4 {
    public static void binarySearch(int arr[], int pertama, int akhir, int temp) {
        int tengah = (pertama + akhir) / 2;
        while (pertama <= akhir) {
            if (arr[tengah] < temp) {
                pertama = tengah + 1;
            } else if (arr[tengah] == temp) {
                System.out.println(tengah);
                break;
            } else {
                akhir = tengah - 1;
            }
            tengah = (pertama + akhir) / 2;
        }
        if (pertama > akhir) {
            System.out.println(-1);
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 1, 3, 5, 5, 6, 7 };
        int temp = 3;  
        int akhir = arr.length - 1;
        binarySearch(arr, 0, akhir, temp);
    }
}