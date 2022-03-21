
public class task3 {

    public static void main(String[] args) {
        Vehicles v = new Vehicles("Gerobak", "no");
        v.identify_myself();

        v = new Bikes("Pedal", "no");
        v.identify_myself();
        v = new Bikes("Motor", "with");
        v.identify_myself();

        System.out.println("");

        v = new Cars("Sport", "With");
        v.identify_myself();
        v = new Cars("Pickup", "With");
        v.identify_myself();
        System.out.println("");

        v = new Bus("Public Bus", "Trans Jakarta");
        v.identify_myself();
        v = new Bus("Private engine", "School bus");
        v.identify_myself();

    }
}
