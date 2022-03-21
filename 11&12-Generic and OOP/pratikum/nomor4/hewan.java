public class hewan {
    public static void main(String[] args) {
        Animals a = new Animals("Binatang", "Mew", "Gigi");
        a.identify_myself();

        a = new Herbivor("Kambing", "tumbuhan", "tumpul");
        a.identify_myself();

        a = new Carnivor("Singa", "Daging", "tajam");
        a.identify_myself();
        
        a = new Omnivor("Ayam", "Semua", "tumpul");
        a.identify_myself();

    }
}
