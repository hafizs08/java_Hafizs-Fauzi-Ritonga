
    public class Bikes extends Vehicles {

        public Bikes(String name, String with_engine) {
            super(name, with_engine);
        }

        @Override
        public void identify_myself() {
            System.out.println("I am a bike, My name is " + super.getName() + " Bikes, My Engine Status is '" + super.getWith_engine() + " engine' I have 2 wheels(s)");
        }
    }

    //     Bikes(String name, String with_engine) {
    //         super(name, with_engine);
    //     }
        
    // }

    // @Override
    // void identify_myself() {
    //     System.out.println("Hi I'm Parent off all vehicles, My name is " + name + ", My Engine Status is '" + with_engine + " engine'");
        
    // }


