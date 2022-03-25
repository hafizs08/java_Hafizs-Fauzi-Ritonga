import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bintang {
    public static void main(String[] args) {
        Hewan hewan = new Hewan();
        hewan.Menu();
    }
}

interface Game {
    public void acakKandang(int randomKandang);
    public String kandang();
    public void Menu();
    public void Input();
    public void pilihKandang(List<Kandang> listkandang);

}

class Kandang {
    private String isiKadang;
    private boolean pickKadang;

    public Kandang(String isiKadang) {
        super();
        this.isiKadang = isiKadang;

    }
    public String getIsiKadang() {
        return isiKadang;
    }

    public void setIsiKadang(String isiKadang) {
        this.isiKadang = isiKadang;
    }

    public boolean isAturKandang() {
        return pickKadang;
    }

    public void setAturKandang(boolean pickKadang) {
        this.pickKadang = pickKadang;
    }

    public void bukaKandang(String dalamKadang) {
        System.out.println("|||");
        System.out.println("|" + dalamKadang + "|");
        System.out.println("|||");
        System.out.println(" ");
    }

    public void buatKandang(int jmhKandang) {
        for (int i = 1; i <= jmhKandang; i++) {
            bukaKandang(String.valueOf(i));
        }
    }
}

class kandangKambing extends Kandang {

    public kandangKambing() {
        super("K");
        // TODO Auto-generated constructor stub
    }

}

class kandangBebek extends Kandang {

    public kandangBebek() {
        super("B");
        // TODO Auto-generated constructor stub
    }

}
class kandangZebra extends Kandang {
    public kandangZebra() {
        super("Z");
        // TODO Auto-generated constructor stub
    }
}

class Hewan implements Game {
    private double jumlahKandang;
    private Scanner input;
    private List<Kandang> listkandang;

    public Hewan() {

        super();
        this.input = new Scanner(System.in);
        this.listkandang = new ArrayList<>();
    }

    @Override
    public void acakKandang(int randomKandang) {
        // TODO Auto-generated method stub
        int a = (int) (Math.random() * 3) + 1;
        for (int i = 1; i <= randomKandang; i++) {
            if (a == 1) {
                listkandang.add(new kandangBebek());
            } else if (a == 2) {
                listkandang.add(new kandangKambing());
            } else { 
                listkandang.add(new kandangZebra());
            }
        }

    }

    @Override
    public String kandang() {
        // TODO Auto-generated method stub

        return null;
    }

    @Override
    public void Menu() {
        // TODO Auto-generated method stub
        loopmenu: 
        while (true) {
            System.out.println("\n Tebak Kandang");
            System.out.println("-----------------------------");
            System.out.println(" 1 : Jumlah Kandang");
            System.out.println("99: Exit");
            System.out.println("-----------------------------");
            System.out.print("Pilih menu: ");
            int Menu = input.nextInt();

            switch (Menu) {
                case 1:
                    Input();
                    break;
                case 99:
                    break loopmenu; 
                default:
                    System.out.println("Pilihan tidak ada");

            }
        }
    }

    @Override
    public void Input() {
        // TODO Auto-generated method stub
        System.out.print("\nMasukan jumlah Kandang : ");
        int jumlahKandang = input.nextInt();
        acakKandang(jumlahKandang);
        pilihKandang(listkandang);

    }

    @Override
    public void pilihKandang(List<Kandang> listkandang) {
        // TODO Auto-generated method stub
        int poin = 0;
        while (poin < listkandang.size()) {
            for (int i = 0; i < listkandang.size(); i++) {
                if (listkandang.get(i).isAturKandang()) {
                    listkandang.get(i).bukaKandang(listkandang.get(i).getIsiKadang());
                } else {
                    listkandang.get(i).bukaKandang(String.valueOf(i + 1));
                }
            }
            System.out.print("Pilih kandang yang ingin dibuka :");
            int noKandang = input.nextInt();
            System.out.println("\n ---PILIHAN---");
            System.out.println("K=Kambing");
            System.out.println("Z=Zebra");
            System.out.println("B=Bebek");
            System.out.println(" ");
            System.out.print("Masukan tebakan : ");
            String tebakan = input.next();

            if (listkandang.get(noKandang - 1).getIsiKadang().equals(tebakan)) {
                System.out.println("Tebakan Benar");
                listkandang.get(noKandang - 1).setAturKandang(true);
                poin++;
            } else {
                System.out.println("Tebakan Salah");
            }
        }
    }

}