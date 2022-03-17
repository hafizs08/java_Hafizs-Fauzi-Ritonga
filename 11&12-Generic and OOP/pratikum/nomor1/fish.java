public class fish {
    public String Name;
    public String Makan;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMakan() {
        return Makan;
    }

    public void setMakan(String makan) {
        Makan = makan;
    }

    public void displayFish() {
        System.out.println("Saya Ikan dengan detail,Jenis: " + Name + " Makanan : " + Makan);
    }

}
