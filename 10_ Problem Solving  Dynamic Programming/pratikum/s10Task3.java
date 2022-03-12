public class s10Task3 {
    public static void main(String[] args) {
        System.out.println(frog(new int[] { 30, 10, 60, 10, 60, 50 }));
        System.out.println(frog(new int[] { 10, 30, 40, 20 }));
    }

    public static int frog(int[] jump) {
        int[] temp = new int[jump.length];
        temp[0] = 0;
        temp[1] = Math.abs(jump[0] - jump[1]);

        for (int i = 2; i < jump.length; i++) {
            int one = temp[i - 1] + Math.abs(jump[i - 1] - jump[i]);
            int two = temp[i - 2] + Math.abs(jump[i - 2] - jump[i]);
            temp[i] = Math.min(one, two);

        }
        return temp[jump.length - 1];

    }

}
