public class car {
    public String Type;
    public String Color ;
    public int Roda;
    public String getType() {
        return Type;
    }
    public void setType(String type) {
        Type = type;
    }
    public String getColor() {
        return Color;
    }
    public void setColor(String color) {
        Color = color;
    }
    public int getRoda() {
        return Roda;
    }
    public void setRoda(int roda) {
        Roda = roda;
    }
    
    public void displayCat() {
        System.out.println("Saya Mobil dengan detail, Type: " + Type + ", Color : " + Color + ", Num of tire " + Roda);
      }
    
    
}
