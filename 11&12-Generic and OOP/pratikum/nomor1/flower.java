public class flower {
    protected String Name;
    protected String Color;
    protected int petal;
    
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getColor() {
        return Color;
    }
    public void setColor(String color) {
        Color = color;
    }
    public int getPetal() {
        return petal;
    }
    public void setPetal(int petal) {
        this.petal = petal;
    }

    public void displayCat() {
        System.out.println("Saya Bunga dengan detail, jenis: bangkai color: "+Name +", Color: " + Color + "num of petal: " + petal);
    }
    



}
