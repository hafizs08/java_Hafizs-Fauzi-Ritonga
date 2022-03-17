import java.util.Scanner;

class cal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        calculator c = new calculator();

        c.panggil();
        System.out.println("1: Open Calculator");
        System.out.println("99: Exit");
        System.out.print("masukan pilahan anda : ");
        int pil = input.nextInt();

        if (pil == 1) {
            c.panggil();
            System.out.println("masukan value 1 : ");
            int a = input.nextInt();
            System.out.println("masukan value 2 : ");
            int b = input.nextInt();
            c.panggil();
            System.out.println("1: Add Value");
            System.out.println("2: Sub Value");
            System.out.println("3: Multiply Value");
            System.out.println("4: Divide Value");
            c.panggil();
            System.out.print("pilahan anda : ");
            int pil2 = input.nextInt();

            if (pil2 == 1) {
                System.out.println("Pilihan anda : " + pil2);
                c.add(a, b);
            } else if (pil2 == 2) {
                System.out.println("Pilihan anda : " + pil2);
                c.sub(a, b);
            } else if (pil2 == 3) {
                System.out.println("Pilihan anda : " + pil2);
                c.multiply(a, b);
            } else if (pil2 == 4) {
                System.out.println("Pilihan anda : " + pil2);
                c.divide(a, b);
            }

            else {
                System.out.println("Pilihan anda : " + pil2);
                System.out.println("Pilihan anda tidak ada");
                input.close();
            }

        }

    }
}

abstract class data {
    public int add(int a, int b) {
        int c = a + b;
        System.out.println("Hasil : " + c);
        return c;
    }

    public int sub(int a, int b) {
        int c = a - b;
        System.out.println("Hasil : " + c);
        return c;
    }

    public int multiply(int a, int b) {
        int c = a * b;
        System.out.println("Hasil : " + c);
        return c;
    }

    public int divide(int a, int b) {
        int c = a / b;
        System.out.println("Hasil : " + c);
        return c;
    }

}

class calculator extends data {
    private String title = " ";

    public String panggil() {
        System.out.println("+++++++++++++++++++++calcutor+++++++++++++++++++++++");
        return title;
    }
}
