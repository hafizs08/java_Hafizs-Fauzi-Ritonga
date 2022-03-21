public class Bus extends Vehicles {

    public Bus(String name, String with_engine) {
        super(name, with_engine);
        //TODO Auto-generated constructor stub
    }


    @Override
    public void identify_myself() {
        System.out.println("I am a Bus [" + super.getName() + "], My nama is '"
                + super.getWith_engine() + " My Engine Status  is 'with Engine', engine' I have 4 wheels(s)");
    }
}
