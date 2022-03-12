public interface s10task4 {
    public static void main(String[] args) {
        taskRoma(9);
        taskRoma(23);
        taskRoma(2021);
        taskRoma(1646);
    }

    public static void taskRoma(int angka) {
        String[] arrRoma = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int[] value = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

        StringBuilder roma = new StringBuilder();
        
        for (int i = 0; i < value.length; i++) {
            while (angka >= value[i]) {
                angka -= value[i];
                roma.append(arrRoma[i]);
            }
        }
        System.out.println(roma);

    }
}
