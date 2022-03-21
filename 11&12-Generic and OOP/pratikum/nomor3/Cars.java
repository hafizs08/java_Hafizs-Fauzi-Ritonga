public class Cars extends Vehicles {

    public Cars(String name, String with_engine) {
        super(name, with_engine);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void identify_myself() {
        System.out.println("I am a Car, My name is " + super.getName() + " Cars, My Engine Status is '"
                + super.getWith_engine() + " engine' I have 4 wheels(s)");
    }
}
