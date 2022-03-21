

public class Animals {
    private String name;
    private String makan;
    private String gigi;

    public String getGigi() {
        return gigi;
    }

    public void setGigi(String gigi) {
        this.gigi = gigi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getmakan() {
        return makan;
    }
    public void setmakan(String makan) {
        this.makan = makan;
    }
    public Animals(String name, String makan, String gigi) {
        this.name = name;
        this.makan = makan;
        this.gigi = gigi;
    }
    public void identify_myself() {
        System.out.println("Hi I'm Parent off all Animals, My name is " + name );
        
    }
    
}
