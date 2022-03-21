public class Omnivor extends Animals {
    public Omnivor(String name, String makan, String gigi) {
        super(name, makan, gigi);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void identify_myself() {
        System.out.println("I am a Omnivor  , My nama is '"
                + super.getName() + " My Food is '" + super.getmakan() + "', I have " + super.getGigi() + " Teeth");
    }
}